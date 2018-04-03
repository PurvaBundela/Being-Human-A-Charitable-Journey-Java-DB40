/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chart;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.util.Rotation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieItemLabelGenerator;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.TableOrder;

/**
 *
 * @author palakagrawal
 */
public class PieChart extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel userProcessContainer;
    private EcoSystem system;

    public PieChart(String applicationTitle, String chartTitle, JPanel userProcessContainer, EcoSystem system, int questionNum) {
        super(applicationTitle);
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        // This will create the dataset

        PieDataset dataset = createDatasetForAllTypeOfEmp();
        JFreeChart chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);

    }

    public PieChart(String applicationTitle, String chartTitle, JPanel userProcessContainer, EcoSystem system) {
        super(applicationTitle);
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        // This will create the dataset
        CategoryDataset dataset1;
        dataset1 = createDatasetForMultiplePie();
        final JFreeChart chart = createChartForMultiplePie(dataset1);
        final ChartPanel chartPanel = new ChartPanel(chart, true, true, true, false, true);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 380));
        setContentPane(chartPanel);
    }

    /**
     * Creates a sample chart with the given dataset.
     *
     * @param dataset the dataset.
     *
     * @return A sample chart.
     */
    private JFreeChart createChartForMultiplePie(final CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createMultiplePieChart(
                "Multiple Pie Chart", // chart title
                dataset, // dataset
                TableOrder.BY_ROW,
                true, // include legend
                true,
                false
        );
        MultiplePiePlot plot = (MultiplePiePlot) chart.getPlot();
        JFreeChart subchart = plot.getPieChart();
        PiePlot p = (PiePlot) subchart.getPlot();
        p.setLabelGenerator(new StandardPieItemLabelGenerator("{0}"));
        p.setLabelFont(new Font("SansSerif", Font.PLAIN, 8));
        p.setInteriorGap(0.30);

        return chart;
    }

    /**
     * Creates a sample dataset
     */
    private PieDataset createDataset() {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Linux", 29);
        result.setValue("Mac", 20);
        result.setValue("Windows", 51);
        return result;

    }

    private PieDataset createDatasetForAllTypeOfEmp() {

       
        DefaultPieDataset resultOrg = new DefaultPieDataset();
        
        int personCount;
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise en : network.getEnterpriseList().getEnterpriseList()) {
                for (Organization org : en.getOrganizationDirectory().getOrganizationList()) {
                    personCount = 0;
                    for (Person p : org.getPersonDirectory().getPersonList()) {
                        personCount++;

                    }
                    
                    resultOrg.setValue(org.getName(), personCount);
                }
                
            }
            
        }

        return resultOrg;
    }

    private CategoryDataset createDatasetForMultiplePie() {
        final double[][] data = new double[3][4];
        int i = 0;
        int orgCount = 0;
        for (Network net : system.getNetworkList()) {
            if (i < 3) {

                for (Enterprise ent : net.getEnterpriseList().getEnterpriseList()) {
                    int j = i;
                    if (j < 4) {
                        orgCount = 0;
                        for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {

                            orgCount++;

                        }
                        data[i][j] = orgCount;
                        j++;
                    }
                }
                i++;
            }
        }
        final CategoryDataset dataset1 = DatasetUtilities.createCategoryDataset(
                "Network ",
                "Enterprise",
                data
        );
        return dataset1;

    }

    /**
     * Creates a chart
     */
    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart3D(
                title, // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;

    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    /*public static void main(String[] args) {

        PieChart demo = new PieChart("Pie Chart","pie demo");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }*/
}

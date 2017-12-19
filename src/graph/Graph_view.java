package graph;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_view extends Frame implements ActionListener,WindowListener{
	private Button button1 = new Button("BarChart");
	private Button button2 = new Button("LineChart");
	public Graph_view() {
		addWindowListener(this);
		setTitle("Graph");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	public void chart(String c) {
		removeAll();
		add(button1);
		add(button2);
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		
		data.addValue(300, "USA", "2005");
		data.addValue(500, "USA", "2006");
		data.addValue(120, "USA", "2007");
		
		data.addValue(200, "China", "2005");
		data.addValue(400, "China", "2006");
		data.addValue(320, "China", "2007");
		
		addWindowListener(this);
		setTitle("Graph");
		
		if(c == "Line") {
			JFreeChart chart = 
				      ChartFactory.createLineChart("Import Volume",
				                                   "Year",
				                                   "Ton",
				                                   data,
				                                   PlotOrientation.VERTICAL,
				                                   true,
				                                   false,
				                                   false);

				    ChartPanel cpanel = new ChartPanel(chart);
				    add(cpanel, BorderLayout.CENTER);
		}else if(c == "Bar") {
			JFreeChart chart = 
	      ChartFactory.createBarChart("Import Volume",
	                                   "Year",
	                                   "Ton",
	                                   data,
	                                   PlotOrientation.VERTICAL,
	                                   true,
	                                   false,
	                                   false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);
		}
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button1) {
			chart("Bar");
		}else if(arg0.getSource() == button2) {
			chart("Line");
		}
		setVisible(true);
	}

}

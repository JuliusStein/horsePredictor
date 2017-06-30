import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.io.*;

class Table extends JFrame
 {

    private JPanel topPanel;
    public JTable table;
    private JScrollPane scrollPane;
    public Object[][] data;
    public int horses;
    
    public Table(int numHorses)
    {
        
        horses = numHorses;
     
        setTitle( "Horse Data" );
        setSize( 3000, 250 );
        setBackground( Color.BLACK );


        // Create a panel to hold all other components
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        
        getContentPane().add(topPanel);

        // Create columns names
        String columnNames[] = { "Name", "Number", "Class", "Time 1", "Distance 1", "Place 1", "Time 2", "Distance 2", "Place 2 ", "Time 3", "Distance 3", "Place 3", "Time 4", "Distance 4", "Place 4", "Num times horse placed w/ Jockey?"};
        
        Object[][] blank = new Object[numHorses][16];
        
        // Create a new table instance
        table = new JTable( blank, columnNames );
        table.setGridColor(Color.BLACK);
        data = new Object[table.getRowCount()][table.getColumnCount()];
        
        scrollPane = new JScrollPane( table );
        topPanel.add( scrollPane, BorderLayout.CENTER );
        
        
        table.setRowHeight(25);
        table.setAutoResizeMode(table.getAutoResizeMode());
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(75);
        table.getColumnModel().getColumn(5).setPreferredWidth(50);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.getColumnModel().getColumn(7).setPreferredWidth(75);
        table.getColumnModel().getColumn(8).setPreferredWidth(50);
        table.getColumnModel().getColumn(9).setPreferredWidth(100);
        table.getColumnModel().getColumn(10).setPreferredWidth(75);
        table.getColumnModel().getColumn(11).setPreferredWidth(50);
        table.getColumnModel().getColumn(12).setPreferredWidth(100);
        table.getColumnModel().getColumn(13).setPreferredWidth(75);
        table.getColumnModel().getColumn(14).setPreferredWidth(50);
        table.getColumnModel().getColumn(15).setPreferredWidth(200);
        
        //Object blah = table.getValueAt(1,1);
    }

    public Object[][] update(){
        Object[][] newData = new Object[data.length][data[0].length];
        for(int i = 0; i<(newData.length)-1; i++){
            for(int j = 0; j<(newData[0].length)-1; i++){
                newData[i][j] = table.getValueAt(i,j);
            }
        }
        return newData;
    }
    
    public void writeCSVfile(JTable table) throws IOException{
        Writer writer = null;
        JTable dtm = table;
        int nRow = dtm.getRowCount();
        int nCol = dtm.getColumnCount();
        
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("save.txt"), "utf-8"));
            
            for (int i = 0 ; i < nRow ; i++){
                 StringBuffer buffer = new StringBuffer();
                 
                for (int j = 0 ; j < nCol ; j++){
                    buffer.append(dtm.getValueAt(i,j));
                    
                    if (j!=nCol){
                        buffer.append(", ");
                    }
                    
                }
                
                writer.write(buffer.toString() + "\r\n");
            }
            
        }finally{
              writer.close();
        }
    }
    
    public void writeCSVfile(JTable table, String fileName) throws IOException{
        Writer writer = null;
        JTable dtm = table;
        int nRow = dtm.getRowCount();
        int nCol = dtm.getColumnCount();
        
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "utf-8"));
            
            for (int i = 0 ; i < nRow ; i++){
                 StringBuffer buffer = new StringBuffer();
                 
                for (int j = 0 ; j < nCol ; j++){
                    buffer.append(dtm.getValueAt(i,j));
                    
                    if (j!=nCol){
                        buffer.append(", ");
                    }
                    
                }
                
                writer.write(buffer.toString() + "\r\n");
            }
            
        }finally{
              writer.close();
        }
    }
     
}

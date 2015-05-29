/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Model_Alar extends AbstractTableModel implements Serializable {

    public static final int D_INDEX = 0;    
    public static final int T_INDEX = 1;
    public static final int TI_INDEX = 2;
    public static final int ES_INDEX = 3;
   
   // public static final int G_INDEX = 3;
    /**
    Conjunto de peliculas
     */
    private String[] atributo = {"Direccion", "Telefono","Tipo","Estado"};
    private ArrayList<Alar> lista_alar = new ArrayList<Alar>();

    public Model_Alar() {    }

    public ArrayList<Alar> getLista() {
        return lista_alar;
    }

    @Override
    public int getRowCount() {
        return lista_alar.size();
    }

    @Override
    public int getColumnCount() {
        return atributo.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        if (c == 0) {
             return lista_alar.get(f).getDir();
            
        } else  if (c == 1){
            return lista_alar.get(f).getTlf();
            
        } else if (c==2){
            return lista_alar.get(f).getTipo();
        }else{
            return lista_alar.get(f).getEs();
        }
    }

    @Override
    public String getColumnName(int col) {
        return atributo[col];
    }

    @Override
    public void setValueAt(Object val, int row, int col) {

        Alar al;
        boolean guardar = true;

        try {
            al = lista_alar.get(row);
            guardar = false;
        } catch (IndexOutOfBoundsException e) {
            al = new Alar();
        }

        if (col == 0) {
             al.setDir((String) val);
            // al.setTlf(Integer.valueOf((String) val));  
        } else if (col == 1) {
            //al.setDirector((String) val);
            al.setTlf(Integer.valueOf((String) val));    
        } else if (col==2){
            //al.setDirector((String) val);
            al.setTipo((String) val);   
        } else{
            al.setEs((String) val);
        }

        if (guardar) {
            lista_alar.add(al);
        } else {
            lista_alar.remove(row);
            lista_alar.add(row, al);
        }
        fireTableCellUpdated(row, col);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void nuevaFila( String director, int tlf,String tipo,String es) {
        int fila = getRowCount();

        Alar al = new Alar( director, tlf,tipo,es);
        lista_alar.add(al);

        fireTableDataChanged();
    }
/*
    public void load(File file) {
        FileInputStream fin = null;
        ObjectInputStream oin = null;
        Model pm = new Model();

        try {
            fin = new FileInputStream(file);
            oin = new ObjectInputStream(fin);

            lista = (ArrayList<PeliculaDomo>) oin.readObject();
            fireTableDataChanged();
        } catch (Exception e) {
            System.out.println("Se ha producido un error leyendo "
                    + file.getName() + ": " + e.getMessage());
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
            }
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
            }
        }
    }

   public void save(File file) {
        FileOutputStream fout = null;
        ObjectOutputStream oout = null;

        try {
            fout = new FileOutputStream(file);
            oout = new ObjectOutputStream(fout);
            oout.writeObject(lista);
        } catch (Exception e) {
            System.out.println("Se ha producido un error escribiendo "
                    + file.getName() + ": " + e.getMessage());
        } finally {
            try {
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
            }
        }
    }*/
}
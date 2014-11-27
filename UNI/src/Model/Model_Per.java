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

public class Model_Per extends AbstractTableModel implements Serializable {

      public static final int P1_INDEX = 0;
      public static final int P2_INDEX = 1;
      public static final int HAB_INDEX = 2;
    /**
    Conjunto de peliculas
     */
    private String[] atributo = {"Persiana 1","Persiana 2","Habitacion"};
    private ArrayList<Per> lista_b1 = new ArrayList<Per>();

    public Model_Per() {    }

    public ArrayList<Per> getLista() {
        return lista_b1;
    }

    @Override
    public int getRowCount() {
        return lista_b1.size();
    }

    @Override
    public int getColumnCount() {
        return atributo.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        if (c == 0) {
              return lista_b1.get(f).getP1();
        } else  if (c == 1){
             return lista_b1.get(f).getP2();  
            
        }  else {
            return lista_b1.get(f).getHab();
        }
    }

    @Override
    public String getColumnName(int col) {
        return atributo[col];
    }

    @Override
    public void setValueAt(Object val, int row, int col) {

        Per b1;
        boolean guardar = true;

        try {
            b1 = lista_b1.get(row);
            guardar = false;
        } catch (IndexOutOfBoundsException e) {
            b1 = new Per();
        }

        if (col == 0) {
           b1.setP1(Integer.valueOf((String) val));
        } else if (col == 1) {
           b1.setP2(Integer.valueOf((String) val));
        }  else {
           b1.setHab((String) val);    
        }

        if (guardar) {
            lista_b1.add(b1);
        } else {
            lista_b1.remove(row);
            lista_b1.add(row, b1);
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

    public void nuevaFila(int p1,int p2,String hab) {
        int fila = getRowCount();

        Per b1 = new Per(p1,p2,hab);
        lista_b1.add(b1);

        fireTableDataChanged();
    }
/*
    public void load(File file) {
        FileInputStream fin = null;
        ObjectInputStream oin = null;
        Model_Prueba pm = new Model_Prueba();

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
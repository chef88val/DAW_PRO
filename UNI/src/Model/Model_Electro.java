/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Model_Electro extends AbstractTableModel implements Serializable {

    public static final int ROW_INDEX = 0;
    public static final int TITULO_INDEX = 1;
    public static final int DIRECTOR_INDEX = 2;
    public static final int ANYO_INDEX = 3;
  
    /**
    Conjunto de peliculas
     */
    private String[] atributo = {"Aparato", "Consumo", "Posicion"};
    private ArrayList<Electro> lista_electro = new ArrayList<Electro>();

    public Model_Electro() {    }

    public ArrayList<Electro> getLista() {
        return lista_electro;
    }

    @Override
    public int getRowCount() {
        return lista_electro.size();
    }

    @Override
    public int getColumnCount() {
        return atributo.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        if (c == 0) {
            return lista_electro.get(f).getAparato();
        } else if (c == 1) {
            return lista_electro.get(f).getConsumo();
            
        } else  {
            return lista_electro.get(f).getPos();
        } 
    }

    @Override
    public String getColumnName(int col) {
        return atributo[col];
    }

    @Override
    public void setValueAt(Object val, int row, int col) {

        Electro ele;
        boolean guardar = true;

        try {
            ele = lista_electro.get(row);
            guardar = false;
        } catch (IndexOutOfBoundsException e) {
            ele = new Electro();
        }

         if (col == 0) {
            ele.setAparato((String) val);
        } else if (col == 1) {
            ele.setConsumo(Integer.valueOf((String) val));          
        } else {
            ele.setPos((String) val);
        }

        if (guardar) {
            lista_electro.add(ele);
        } else {
            lista_electro.remove(row);
            lista_electro.add(row, ele);
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

    public void nuevaFila(String aparato, int consumo, String pos) {
        int fila = getRowCount();

        Electro ele = new Electro(aparato, consumo,pos);
        lista_electro.add(ele);

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
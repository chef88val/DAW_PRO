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

public class Model_Clima extends AbstractTableModel implements Serializable {

    public static final int TEMP_INDEX = 0;
    public static final int INI_INDEX = 1;
    public static final int FIN_INDEX = 2;
    public static final int HAB_INDEX = 3;
    
    /**
    Conjunto de peliculas
     */
    private String[] atributo = { "Inicio", "Fin","Temperatura(ºC)","Habitacion"};
    private ArrayList<Clima> lista_h1 = new ArrayList<Clima>();

    public Model_Clima() {    }

    public ArrayList<Clima> getLista() {
        return lista_h1;
    }

    @Override
    public int getRowCount() {
        return lista_h1.size();
    }

    @Override
    public int getColumnCount() {
        return atributo.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        if (c == 0) {
            return lista_h1.get(f).getTemp();
        } else if (c == 1) {
            return lista_h1.get(f).getIni();
            
        } else if (c == 2) {
            return lista_h1.get(f).getFin();
        } else {
            return lista_h1.get(f).getHab();
        }
    }

    @Override
    public String getColumnName(int col) {
        return atributo[col];
    }

    @Override
    public void setValueAt(Object val, int row, int col) {

        Clima h1;
        boolean guardar = true;

        try {
            h1 = lista_h1.get(row);
            guardar = false;
        } catch (IndexOutOfBoundsException e) {
            h1 = new Clima();
        }

        if (col == 0) {
           h1.setTemp(Integer.valueOf((String) val));  
        } else if (col == 1) {
           h1.setIni(Integer.valueOf((String) val));
        } else if (col == 2) {
           h1.setFin(Integer.valueOf((String) val));
        } else {
           h1.setHab((String) val);    
        }

        if (guardar) {
            lista_h1.add(h1);
        } else {
            lista_h1.remove(row);
            lista_h1.add(row, h1);
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

    public void nuevaFila(int temp, int ini, int fin,String hab) {
        int fila = getRowCount();

        Clima h1 = new Clima(temp,ini,fin,hab);
        lista_h1.add(h1);

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
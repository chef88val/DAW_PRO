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

public class Model_Comi extends AbstractTableModel implements Serializable {

    public static final int W_INI_INDEX = 0;
    public static final int W_FIN_INDEX = 1;
    public static final int T_INI_INDEX = 2;
    public static final int T_FIN_INDEX = 3;
    /**
    Conjunto de peliculas
     */
    private String[] atributo = {"Inicio Wifi", "Fin Wifi", "Inicio Telefono", "Fin Tlf","Habitacion"};
    private ArrayList<Comi> lista_comi = new ArrayList<Comi>();

    public Model_Comi() {    }

    public ArrayList<Comi> getLista() {
        return lista_comi;
    }

    @Override
    public int getRowCount() {
        return lista_comi.size();
    }

    @Override
    public int getColumnCount() {
        return atributo.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        if (c == 0) {
            return lista_comi.get(f).getW_ini();
        
        } else if (c == 1) {
            return lista_comi.get(f).getW_fin();
        
        } else if (c == 2) {
            return lista_comi.get(f).getT_ini();
        
        } else if (c == 3) {
            return lista_comi.get(f).getT_fin();
        
        }else{ return lista_comi.get(f).getHab();}
    }

    @Override
    public String getColumnName(int col) {
        return atributo[col];
    }

    @Override
    public void setValueAt(Object val, int row, int col) {

        Comi comi;
        boolean guardar = true;

        try {
            comi = lista_comi.get(row);
            guardar = false;
        } catch (IndexOutOfBoundsException e) {
            comi = new Comi();
        }

       if (col == 0) {
           comi.setW_ini(Integer.valueOf((String) val));
        } else if (col ==1) {
           comi.setW_fin(Integer.valueOf((String) val));
        }else if (col == 2) {
           comi.setT_ini(Integer.valueOf((String) val));
        }else  if (col == 3){
           comi.setT_fin(Integer.valueOf((String) val));
        }else {comi.setHab((String) val);}

        if (guardar) {
            lista_comi.add(comi);
        } else {
            lista_comi.remove(row);
            lista_comi.add(row, comi);
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

    public void nuevaFila(int w_ini, int w_fin,int t_ini, int t_fin,String hab) {
        int fila = getRowCount();

        Comi comi = new Comi(w_ini, w_fin,t_ini,t_fin,hab);
        lista_comi.add(comi);

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

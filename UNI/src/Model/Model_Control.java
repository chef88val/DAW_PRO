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

public class Model_Control extends AbstractTableModel implements Serializable {

    public static final int ROW_INDEX = 0;
    public static final int TITULO_INDEX = 1;
    public static final int DIRECTOR_INDEX = 2;
    public static final int ANYO_INDEX = 3;
    public static final int DIR_INDEX = 4;
    /**
    Conjunto de peliculas
     */
    private String[] atributo = {"Numero", "Titulo", "Director", "Anyo","Direccion"};
    private ArrayList<Control> lista = new ArrayList<Control>();

    public Model_Control() {    }

    public ArrayList<Control> getLista() {
        return lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return atributo.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        if (c == 0) {
            return f;
        } else if (c == 1) {
            return lista.get(f).getTitulo();
            
        } else if (c == 2) {
            return lista.get(f).getDirector();
        } else if (c == 3){
            return lista.get(f).getAnyo();
        }else{
            return lista.get(f).getDirecc();
        }
    }

    @Override
    public String getColumnName(int col) {
        return atributo[col];
    }

    @Override
    public void setValueAt(Object val, int row, int col) {

        Control pel;
        boolean guardar = true;

        try {
            pel = lista.get(row);
            guardar = false;
        } catch (IndexOutOfBoundsException e) {
            pel = new Control();
        }

        if (col == 0) {
            System.out.println("La primera columna no se puede editar ");
        } else if (col == 1) {
            pel.setTitulo((String) val);
        } else if (col == 2) {
            pel.setDirector((String) val);
        } else  if (col == 3){
            pel.setAnyo(Integer.valueOf((String) val));          
        }else {
             pel.setDirecc((String) val);
        }

        if (guardar) {
            lista.add(pel);
        } else {
            lista.remove(row);
            lista.add(row, pel);
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

    public void nuevaFila(String titulo, String director, int anyo,String direcc) {
        int fila = getRowCount();

        Control pel = new Control(titulo, director, anyo,direcc);
        lista.add(pel);

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
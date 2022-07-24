package com.upchiapas.javaparajuniors.controllers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.upchiapas.javaparajuniors.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private MenuItem btnAbrirMenuCBCinco;

    @FXML
    private MenuItem btnAbrirMenuCBCuatro;

    @FXML
    private MenuItem btnAbrirMenuCBDos;

    @FXML
    private MenuItem btnAbrirMenuCBTres;

    @FXML
    private MenuItem btnMenuASUno;

    @FXML
    private MenuItem btnMenuCBUno;

    @FXML
    private MenuItem btnMenuOCinco;

    @FXML
    private MenuItem btnMenuOCuatro;

    @FXML
    private MenuItem btnMenuODos;

    @FXML
    private MenuItem btnMenuOTres;

    @FXML
    private MenuItem btnMenuOUno;

    @FXML
    private MenuItem btnMenuSCCuatro;

    @FXML
    private MenuItem btnMenuSCDos;

    @FXML
    private MenuItem btnMenuSCTres;

    @FXML
    private MenuItem btnMenuSCUno;

    @FXML
    private MenuItem btnMenuStringDos;

    @FXML
    private MenuItem btnMenuStringUno;

    @FXML
    private Button btnRegresar;

    @FXML
    private MenuButton cbBasico;

    @FXML
    private TextArea txaInfo;

    @FXML
    void btnAbrirMenuASUno(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Arrays Java/ArraysJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuCBCinco(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Conceptos Básicos de Java/LiteralesEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuCBCuatro(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Conceptos Básicos de Java/ExpresionesSentenciasYBloquesEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuCBDos(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Conceptos Básicos de Java/VariablesEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuCBTres(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Conceptos Básicos de Java/TiposDeDatosPrimitivosEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuCBUno(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Conceptos Básicos de Java/ConceptosBasicosDeJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuOCinco(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Operadores Java/OperadoresDeBitJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuOCuatro(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Operadores Java/OperadoresCondicionalesJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuODos(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Operadores Java/OperadoresUnariosEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuOTres(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Operadores Java/OperadoresDeIgualdadYRelacionalesEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuOUno(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Operadores Java/OperadoresDeAsignacionYAritmeticosEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuSCCuatro(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Sentencias de Control/SentenciasRamificacionEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuSCDos(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Sentencias de Control/SentenciasDecisiónEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuSCTres(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Sentencias de Control/SentenciasBucleEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuSCUno(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Sentencias de Control/SentenciasControlEnJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuStringDos(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Clase String/FuncionesBasicasConCadenas.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuStringUno(ActionEvent event) {
        try
        {
            txaInfo.setText("");
            File f = new File("C:\\Users\\Carlos Gumeta\\Desktop\\txtJava\\Clase String/ClaseStringRepresentandoUnaCadena.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnRegresarALoginOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("login-view","Login - Java para Juniors");
    }

    @FXML
    void cbBasicoOnMouseClicked(MouseEvent event) {
    }

    @FXML
    void cbBasicoOnMouseExited(MouseEvent event) {
    }
}
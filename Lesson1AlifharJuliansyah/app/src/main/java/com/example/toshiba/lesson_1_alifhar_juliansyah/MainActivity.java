package com.example.toshiba.lesson_1_alifhar_juliansyah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView info;
    String text = "0";
    int suku = 0, maxSuku = 10;
    double hasil = 0;
    double[] angka = new double[maxSuku+1];
    int[] operator = new int[maxSuku];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = findViewById(R.id.textInfo);
        btnNol();
        btnSatu();
        btnDua();
        btnTiga();
        btnEmpat();
        btnLima();
        btnEnam();
        btnTujuh();
        btnDelapan();
        btnSembilan();
        btnTambah();
        btnKurang();
        btnKali();
        btnBagi();
        btnHasil();
        btnKoma();
        btnHapus();
        btnClear();
    }

    public void btnNol() {
        Button button = findViewById(R.id.btn0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] res = text.split("[-+x/]");
                if(!res[res.length-1].equals("0") || !text.substring(text.length()-1).matches("[0-9]")) {
                    text += "0";
                    info.setText(text);
                }
            }
        });
    }

    public void btnSatu() {
        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "1";
                else
                    text += "1";
                info.setText(text);
            }
        });
    }

    public void btnDua() {
        Button button = findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "2";
                else
                    text += "2";
                info.setText(text);
            }
        });
    }

    public void btnTiga() {
        Button button = findViewById(R.id.btn3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "3";
                else
                    text += "3";
                info.setText(text);
            }
        });
    }

    public void btnEmpat() {
        Button button = findViewById(R.id.btn4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "4";
                else
                    text += "4";
                info.setText(text);
            }
        });
    }

    public void btnLima() {
        Button button = findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "5";
                else
                    text += "5";
                info.setText(text);
            }
        });
    }

    public void btnEnam() {
        Button button = findViewById(R.id.btn6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "6";
                else
                    text += "6";
                info.setText(text);
            }
        });
    }

    public void btnTujuh() {
        Button button = findViewById(R.id.btn7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "7";
                else
                    text += "7";
                info.setText(text);
            }
        });
    }

    public void btnDelapan() {
        Button button = findViewById(R.id.btn8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "8";
                else
                    text += "8";
                info.setText(text);
            }
        });
    }

    public void btnSembilan() {
        Button button = findViewById(R.id.btn9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0"))
                    text = "9";
                else
                    text += "9";
                info.setText(text);
            }
        });
    }

    public void btnTambah() {
        Button button = findViewById(R.id.btnTambah);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.substring(text.length()-1).matches("[0-9.]"))
                    if(suku < maxSuku) {
                        operator[suku] = 1;
                        suku++;
                        text += "+";
                        info.setText(text);
                    }
            }
        });
    }

    public void btnKurang() {
        Button button = findViewById(R.id.btnKurang);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.substring(text.length()-1).matches("[0-9.]"))
                    if(suku < maxSuku) {
                        operator[suku] = 2;
                        suku++;
                        text += "-";
                        info.setText(text);
                    }
            }
        });
    }

    public void btnKali() {
        Button button = findViewById(R.id.btnKali);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.substring(text.length()-1).matches("[0-9.]"))
                    if(suku < maxSuku) {
                        operator[suku] = 3;
                        suku++;
                        text += "x";
                        info.setText(text);
                    }
            }
        });
    }

    public void btnBagi() {
        Button button = findViewById(R.id.btnBagi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.substring(text.length()-1).matches("[0-9.]"))
                    if(suku < maxSuku) {
                        operator[suku] = 4;
                        suku++;
                        text += "/";
                        info.setText(text);
                    }
            }
        });
    }

    public void btnKoma() {
        Button button = findViewById(R.id.btnKoma);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.substring(text.length()-1).matches("[0-9]")) {
                    String[] res = text.split("[-+x/]");
                    if (!res[res.length-1].matches(".*[.].*"))
                        text += ".";
                }
                else if(text.substring(text.length()-1).matches("[-+x/]"))
                    text += "0.";
                info.setText(text);
            }
        });
    }

    public void btnHasil() {
        Button button = findViewById(R.id.btnHasil);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res=0;
                boolean minus = false;
                if(text.charAt(0)=='-') {
                    text = text.substring(1);
                    minus = true;
                }
                for(String nilai: text.split("[-+x/]")) {
                    angka[res] = Double.parseDouble(nilai);
                    res++;
                }
                if(minus)
                    angka[0] = angka[0] * -1;

                boolean check = false;
                boolean cont = false;
                int flag=0;
                if(res==1) angka[1]=1 ;
                for (int count=0; count<suku; count++) {
                    if(operator[count]==3) {
                        if(cont) {
                            angka[flag] = angka[flag] * angka[count+1];
                        } else {
                            angka[count] = angka[count] * angka[count+1];
                            flag = count;
                            cont = true;
                        }
                    }
                    else if(operator[count]==4) {
                        if(angka[count+1]!=0) {
                            if(cont) {
                                angka[flag] = angka[flag] / angka[count + 1];
                            } else {
                                angka[count] = angka[count] / angka[count+1];
                                flag = count;
                                cont = true;
                            }
                        } else {
                            count=suku+1;
                            check = true;
                            text = "Can't divided by zero";
                        }
                    } else
                        cont = false;
                }

                if(res==1) angka[1]=0 ;
                hasil = angka[0];
                if(!check) {
                    for (int count=0; count<suku; count++) {
                        if(operator[count]==1)
                            hasil = hasil + angka[count+1];
                        else if(operator[count]==2)
                            hasil = hasil - angka[count+1];
                    }
                    text = Double.toString(hasil);
                    if(hasil%1==0)
                        text = String.format(Locale.US,"%.0f", hasil);
                }

                info.setText(text);
                if(check)
                    text="0";
                suku=0;
            }
        });
    }

    public void btnHapus() {
        Button button = findViewById(R.id.btnHapus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.length()==1)
                    text="0";
                else if(text.length()>1) {
                    if(text.substring(text.length()-1).matches("[-+x/]"))
                        suku--;
                    text = text.substring(0, text.length() - 1);
                }
                info.setText(text);
            }
        });
    }

    public void btnClear() {
        Button button = findViewById(R.id.btnClear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="0";
                suku=0;
                info.setText(text);
            }
        });
    }

}

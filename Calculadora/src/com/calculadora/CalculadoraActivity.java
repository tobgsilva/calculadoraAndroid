package com.calculadora;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;


import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class CalculadoraActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculadora);
		
		final List valores =new ArrayList<Float>();
		final List sinais = new ArrayList<Integer>();
		Button btn0 = (Button) findViewById(R.id.bt_0);
		Button btn1 = (Button) findViewById(R.id.bt_1);
		Button btn2 = (Button) findViewById(R.id.bt_2);
		Button btn3 = (Button) findViewById(R.id.bt_3);
		Button btn4 = (Button) findViewById(R.id.bt_4);
		Button btn5 = (Button) findViewById(R.id.bt_5);
		Button btn6 = (Button) findViewById(R.id.bt_6);
		Button btn7 = (Button) findViewById(R.id.bt_7);
		Button btn8 = (Button) findViewById(R.id.bt_8);
		Button btn9= (Button) findViewById(R.id.bt_9);
		Button btnponto = (Button) findViewById(R.id.bt_ponto);
		Button btnigual = (Button) findViewById(R.id.bt_igual);
		Button btndivi = (Button) findViewById(R.id.bt_divi);
		Button btnmult = (Button) findViewById(R.id.bt_mult);
		Button btnsubt = (Button) findViewById(R.id.bt_subt);
		Button btnsoma = (Button) findViewById(R.id.bt_soma);
		Button btnc = (Button) findViewById(R.id.bt_c);
		Button btnsair = (Button) findViewById(R.id.bt_sair);
		final EditText txtvisor= (EditText)findViewById(R.id.txt_visor);
		txtvisor.setFocusableInTouchMode(false);
		txtvisor.setFocusable(false);
		
		btn0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "0");
				
			}
		});
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "1");
				
			}
		});
		
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "2");
				
			}
		});
		
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "3");
				
			}
		});
		
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "4");
				
			}
		});
		
		btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "5");
				
			}
		});
		
		btn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "6");
				
			}
		});
		
		btn7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "7");
				
			}
		});
		
		btn8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "8");
				
			}
		});
		
		btn9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(txtvisor.getText()+ "9");
				
			}
		});
		
		btndivi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!txtvisor.getText().toString().equals("")){
				valores.add(Float.parseFloat(txtvisor.getText().toString()));
				sinais.add(1);
				txtvisor.setText("");
				}
			}
		});
		
		btnmult.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!txtvisor.getText().toString().equals(""))
				valores.add(Float.parseFloat(txtvisor.getText().toString()));
				sinais.add(2);
				txtvisor.setText("");
			}
			}
		);
		
		btnsubt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!txtvisor.getText().toString().equals("")){
				valores.add(Float.parseFloat(txtvisor.getText().toString()));
				sinais.add(3);
				txtvisor.setText("");
				}
			}
		});
		
		btnsoma.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!txtvisor.getText().toString().equals("")){
				valores.add(Float.parseFloat(txtvisor.getText().toString()));
				sinais.add(4);
				txtvisor.setText("");
				}
			}
		});
		
		btnponto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(!(txtvisor.getText().toString().indexOf(".") != -1)){ 
				     if(!txtvisor.getText().toString().equals("")){
				      txtvisor.setText(txtvisor.getText() + ".");
				     } else {
				      txtvisor.setText(txtvisor.getText() + "0.");
				     }
				    }
				   }
		});
		
		btnigual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (!valores.isEmpty() || !sinais.isEmpty()){ 
				    int i = 0;
				    int opcao;
				    if(!txtvisor.getText().toString().equals("")){
				     valores.add(Float.parseFloat(txtvisor.getText().toString()));
				    }
				    float total =Float.parseFloat(valores.get(i).toString());
				    if(valores.size()>1){
				    while(sinais.size()>i){
				     opcao = Integer.parseInt((sinais.get(i).toString()));
				      switch (opcao) {
				      case 1:
				    	  if (Float.parseFloat(valores.get(i+1).toString()) != 0){
				    	        total /= Float.parseFloat(valores.get(i+1).toString());
				    	       } else {
				    	        total = 0;
				    	       }
				       break;
				      case 2:
				    	  total *= Float.parseFloat(valores.get(i+1).toString());
				       
				       break;
				      case 3:
				    	  total -= Float.parseFloat(valores.get(i+1).toString());
				       break;
				      case 4:
				    	  total += Float.parseFloat(valores.get(i+1).toString());
				      default:
				       break;
				      }
				      i++;
				        }
				    }
				     txtvisor.setText(String.valueOf(total));
				        valores.clear();
				        sinais.clear();
				    }
			}
			});
		
		btnc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				txtvisor.setText(String.valueOf(""));
				valores.clear();
				sinais.clear();
				
			}
		});
		
		btnsair.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				CalculadoraActivity.this.finish();
				
			}
		});
		
		
	}



	
}

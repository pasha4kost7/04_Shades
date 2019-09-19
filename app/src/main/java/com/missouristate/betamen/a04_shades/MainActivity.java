package com.missouristate.betamen.a04_shades;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TicTacToe tttGame;
   // private Button[][] buttons;
    private Button[]myButtons;
    private String[] namesBut ={ "PLUM", "BLUE", "GOLD"};
    private TextView status;
    private int y = 1;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
     //  layout = (ConstraintLayout) findViewById(id.CL_1);

       // root.setBackgroundColor(0xFFFFFFFF);
      //  View someView = findViewById(R.id.screen);
    //    someView.layout =  findViewById(id.CL_1);




   //     someView.setBackground(getResources().getDrawable(R.drawable.));
      //  someView.setBackgroundColor(Color.parseColor("#fff"));
    //    tttGame = new TicTacToe( );
        buildGuiByCode( );
    }
    public void buildGuiByCode( ) {
        // Get width of the screen
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w = size.x;
        y = (int) (w * .25);

        // Create the layout manager as a GridLayout
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(1);
        gridLayout.setRowCount(TicTacToe.SIDE);

        myButtons = new Button[3];
        ButtonHandler bh = new ButtonHandler();
        for (int i = 0; i < 3; i++) {
            myButtons[i] = new Button(this);
            myButtons[i].setText(namesBut[i]);
             myButtons[i].setBackgroundColor(Color.parseColor("#c89b6d"));

            myButtons[i].setOnClickListener(bh);
            gridLayout.addView(myButtons[i], w, y);

            // addView(myButtons[i],width,width);
        }


        setContentView(gridLayout); //keep this





        // set up layout parameters of 4th row of gridLayout
        status = new TextView(this);
        GridLayout.Spec rowSpec = GridLayout.spec(0, 3);
        GridLayout.Spec columnSpec = GridLayout.spec(0, 1);
//        GridLayout.Spec rowSpec = GridLayout.spec( TicTacToe.SIDE, 1 );
//        GridLayout.Spec columnSpec = GridLayout.spec( 0, TicTacToe.SIDE );
        GridLayout.LayoutParams lpStatus = new GridLayout.LayoutParams(rowSpec, columnSpec);
        status.setLayoutParams(lpStatus);


        // set up status' characteristics
        status.setWidth(TicTacToe.SIDE * w);
        status.setHeight(w);
        status.setGravity(Gravity.CENTER);
        status.setGravity(Gravity.BOTTOM);
        status.setBackgroundColor(Color.GREEN);
        status.setTextSize((int) (w * .015));
        status.setText("test");
            status.setBackgroundColor(Color.parseColor("#c89b6d"));
        //  status.setText( tttGame.result( ) );
        gridLayout.addView(status);

    }
    private class ButtonHandler implements View.OnClickListener {
        public void onClick( View v ) {

            for (int i = 0; i < TicTacToe.SIDE ; i++) {
                if(v == myButtons[i]){
                    update(v, i);
                }
            }
        }
    }
    public void update(View v, int i) {
       // Log.w( "MainActivity", "Inside update: " + row + ", " + col );
      //  myButtons[row].findViewById(R.color.colorAccent);

      //  status.setText(namesBut[row]);
     //   String plum_is = getString(R.string.blue_is);
        for(int p =0; p < myButtons.length;p++){
           // myButtons[p].setText( "X" );
            myButtons[p].setBackgroundColor(Color.parseColor("#c89b6d"));
                String colorText;
            if(v == myButtons[0]){
                // update(i);
                colorText = getString(R.string.plum_is);
                status.setText(getString(R.string.plum_is));
            }else if(v == myButtons[1]){
                // update(i);
                colorText = getString(R.string.blue_is);
                status.setText(colorText);
            }else if(v == myButtons[2]){
                // update(i);
                colorText = getString(R.string.gold_is);
                status.setText(colorText);
            }
        }

       // status.setText(plum_is);

//        myButtons[p].setText( "X" );
//       myButtons[p].setBackgroundColor(Color.parseColor("#c89b6d"));
    }












//        // Create the layout manager as a GridLayout
//        GridLayout gridLayout = new GridLayout( this );
//        gridLayout.setColumnCount( TicTacToe.SIDE );
//        gridLayout.setRowCount( TicTacToe.SIDE + 1 );
//
//        // Create the buttons and add them to gridLayout
//        buttons = new Button[TicTacToe.SIDE][TicTacToe.SIDE];
//       //   buttons[0][0].setText( "X" );
//       //   gridLayout.addView(buttons[0][0]);
//
//        ButtonHandler bh = new ButtonHandler( );
//        for( int row = 0; row < TicTacToe.SIDE; row++ ) {
//            for( int col = 0; col < TicTacToe.SIDE; col++ ) {
//                buttons[row][col] = new Button( this );
//                buttons[row][col].setTextSize( ( int ) ( w *.2 ) );
//                buttons[row][col].setOnClickListener( bh );
//              //  buttons[row][col].setBackgroundColor(Color.parseColor(bdbdbd));
//                //buttons[row][col].setBackground(R.id.);
//             //   buttons[row][col].setText(0);
//            //    buttons[row][col].setText( "X" );
//                gridLayout.addView( buttons[row][col], w, y );
//            }
//        }
//      //  buttons[0][0].setText( "X" );
//      //  gridLayout.addView(buttons[0][0]);
//
//
//        // set up layout parameters of 4th row of gridLayout
//        status = new TextView( this );
//        GridLayout.Spec rowSpec = GridLayout.spec( TicTacToe.SIDE, 1 );
//        GridLayout.Spec columnSpec = GridLayout.spec( 0, TicTacToe.SIDE );
//        GridLayout.LayoutParams lpStatus
//                = new GridLayout.LayoutParams( rowSpec, columnSpec );
//        status.setLayoutParams( lpStatus );
//
//        // set up status' characteristics
//        status.setWidth( TicTacToe.SIDE * w );
//        status.setHeight( y*2 );
//        status.setGravity( Gravity.CENTER );
//        status.setBackgroundColor( Color.BLUE );
//        status.setTextSize( ( int ) ( w * .015 ) );
//        status.setText( tttGame.result( ) );
//
//        gridLayout.addView( status );
//
//
//          // buttons[0][0].setText( "X" );
//        //   gridLayout.addView( buttons[0][0], w, y );
//        // Set gridLayout as the View of this Activity
//        setContentView( gridLayout );
//    }
//
//    public void update( int row, int col ) {
//        int play = tttGame.play( row, col );
//        if( play == 1 )
//            buttons[row][col].setText( "X" );
//        else if( play == 2 )
//            buttons[row][col].setText( "O" );
//        if( tttGame.isGameOver( ) ) {
//            status.setBackgroundColor( Color.RED );
//           // enableButtons( false );
//            status.setText( tttGame.result( ) );
//        }
//    }
////
////    public void enableButtons( boolean enabled ) {
////        for( int row = 0; row < TicTacToe.SIDE; row++ )
////            for( int col = 0; col < TicTacToe.SIDE; col++ )
////                buttons[row][col].setEnabled( enabled );
////    }
////
//    private class ButtonHandler implements View.OnClickListener {
//        public void onClick( View v ) {
//            for( int row = 0; row < TicTacToe.SIDE; row ++ )
//                for( int column = 0; column < TicTacToe.SIDE; column++ )
//                    if( v == buttons[row][column] ){
//                     //   update( row, column );
//                    }
//
//        }
   //}

}

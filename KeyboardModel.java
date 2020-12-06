import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class KeyboardModel {
    Keyboard kb;

    //Non-letters
    private StackPane TILDA_key;
    private StackPane PLUS_key;
    private StackPane APOS_key;
    private StackPane BACKSPACE_key;


    private StackPane TAB_key;
    private StackPane CARET_key;
    private StackPane ENTER_key;
    private StackPane ENTER2_key;


    private StackPane CAPS_key;
    private StackPane STAR_key;

    private StackPane LSHIFT_key;
    private StackPane ANGLE_key;
    private StackPane COMMA_key;
    private StackPane DOT_key;
    private StackPane DASH_key;
    private StackPane RSHIFT_key;

    //Bottom Row
    private StackPane LCTRL_key;
    private StackPane LWIN_key;
    private StackPane LALT_key;
    private StackPane SPACE_key;
    private StackPane RALT_key;
    private StackPane RWIN_key;
    private StackPane MENU_key;
    private StackPane RCTRL_key;

    //Number row
    private StackPane ONE_key;
    private StackPane TWO_key;
    private StackPane THREE_key;
    private StackPane FOUR_key;
    private StackPane FIVE_key;
    private StackPane SIX_key;
    private StackPane SEVEN_key;
    private StackPane EIGHT_key;
    private StackPane NINE_key;
    private StackPane ZERO_key;

    //First row
    private StackPane Q_key;
    private StackPane W_key;
    private StackPane E_key;
    private StackPane R_key;
    private StackPane T_key;
    private StackPane Y_key;
    private StackPane U_key;
    private StackPane I_key;
    private StackPane O_key;
    private StackPane P_key;
    private StackPane Å_key;

    //Second row
    private StackPane A_key;
    private StackPane S_key;
    private StackPane D_key;
    private StackPane F_key;
    private StackPane G_key;
    private StackPane H_key;
    private StackPane J_key;
    private StackPane K_key;
    private StackPane L_key;
    private StackPane Ø_key;
    private StackPane Æ_key;

    //Third row
    private StackPane Z_key;
    private StackPane X_key;
    private StackPane C_key;
    private StackPane V_key;
    private StackPane B_key;
    private StackPane N_key;
    private StackPane M_key;



    public KeyboardModel(){
        kb = new Keyboard();

        /**NON-LETTERS */
        TILDA_key = new StackPane();
        Text TILDA_label = new Text("§ |");
        Rectangle TILDA_shape = new Rectangle(25, 25);
        TILDA_shape.setStroke(Color.BLACK);
        TILDA_shape.setFill(new Color(1, 0, 0, 0));
        TILDA_key.getChildren().addAll(TILDA_shape, TILDA_label);

        TAB_key = new StackPane();
        Text TAB_label = new Text("↹");
        Rectangle TAB_shape = new Rectangle(35, 25);
        TAB_shape.setStroke(Color.BLACK);
        TAB_shape.setFill(new Color(1, 0, 0, 0));
        TAB_key.getChildren().addAll(TAB_shape, TAB_label);

        CAPS_key = new StackPane();
        Text CAPS_label = new Text("Caps");
        Rectangle CAPS_shape = new Rectangle(40, 25);
        CAPS_shape.setStroke(Color.BLACK);
        CAPS_shape.setFill(new Color(1, 0, 0, 0));
        CAPS_key.getChildren().addAll(CAPS_shape, CAPS_label);

        LSHIFT_key = new StackPane();
        Text LSHIFT_label = new Text("⇧");
        Rectangle LSHIFT_shape = new Rectangle(30, 25);
        LSHIFT_shape.setStroke(Color.BLACK);
        LSHIFT_shape.setFill(new Color(1, 0, 0, 0));
        LSHIFT_key.getChildren().addAll(LSHIFT_shape, LSHIFT_label);

        ANGLE_key = new StackPane();
        Text ANGLE_label = new Text("> <");
        Rectangle ANGLE_shape = new Rectangle(25, 25);
        ANGLE_shape.setStroke(Color.BLACK);
        ANGLE_shape.setFill(new Color(1, 0, 0, 0));
        ANGLE_key.getChildren().addAll(ANGLE_shape, ANGLE_label);

        COMMA_key = new StackPane();
        Text COMMA_label = new Text("; ,");
        Rectangle COMMA_shape = new Rectangle(25, 25);
        COMMA_shape.setStroke(Color.BLACK);
        COMMA_shape.setFill(new Color(1, 0, 0, 0));
        COMMA_key.getChildren().addAll(COMMA_shape, COMMA_label);

        DOT_key = new StackPane();
        Text DOT_label = new Text(": .");
        Rectangle DOT_shape = new Rectangle(25, 25);
        DOT_shape.setStroke(Color.BLACK);
        DOT_shape.setFill(new Color(1, 0, 0, 0));
        DOT_key.getChildren().addAll(DOT_shape, DOT_label);

        DASH_key = new StackPane();
        Text DASH_label = new Text("_ -");
        Rectangle DASH_shape = new Rectangle(25, 25);
        DASH_shape.setStroke(Color.BLACK);
        DASH_shape.setFill(new Color(1, 0, 0, 0));
        DASH_key.getChildren().addAll(DASH_shape, DASH_label);

        PLUS_key = new StackPane();
        Text PLUS_label = new Text("? +");
        Rectangle PLUS_shape = new Rectangle(25, 25);
        PLUS_shape.setStroke(Color.BLACK);
        PLUS_shape.setFill(new Color(1, 0, 0, 0));
        PLUS_key.getChildren().addAll(PLUS_shape, PLUS_label);

        APOS_key = new StackPane();
        Text APOS_label = new Text("` \\");
        Rectangle APOS_shape = new Rectangle(25, 25);
        APOS_shape.setStroke(Color.BLACK);
        APOS_shape.setFill(new Color(1, 0, 0, 0));
        APOS_key.getChildren().addAll(APOS_shape, APOS_label);

        BACKSPACE_key = new StackPane();
        Text BACKSPACE_label = new Text("⟵");
        Rectangle BACKSPACE_shape = new Rectangle(50, 25);
        BACKSPACE_shape.setStroke(Color.BLACK);
        BACKSPACE_shape.setFill(new Color(1, 0, 0, 0));
        BACKSPACE_key.getChildren().addAll(BACKSPACE_shape, BACKSPACE_label);

        CARET_key = new StackPane();
        Text CARET_label = new Text("^ ~");
        Rectangle CARET_shape = new Rectangle(25, 25);
        CARET_shape.setStroke(Color.BLACK);
        CARET_shape.setFill(new Color(1, 0, 0, 0));
        CARET_key.getChildren().addAll(CARET_shape, CARET_label);

        ENTER_key = new StackPane();
        Text ENTER_label = new Text("Enter");
        Rectangle ENTER_shape = new Rectangle(40, 25);
        ENTER_shape.setStroke(Color.BLACK);
        ENTER_shape.setFill(new Color(1, 0, 0, 0));
        ENTER_key.getChildren().addAll(ENTER_shape, ENTER_label);

        ENTER2_key = new StackPane();
        Text ENTER2_label = new Text("Enter");
        Rectangle ENTER2_shape = new Rectangle(35, 25);
        ENTER2_shape.setStroke(Color.BLACK);
        ENTER2_shape.setFill(new Color(1, 0, 0, 0));
        ENTER2_key.getChildren().addAll(ENTER2_shape, ENTER2_label);

        STAR_key = new StackPane();
        Text STAR_label = new Text("` \\");
        Rectangle STAR_shape = new Rectangle(25, 25);
        STAR_shape.setStroke(Color.BLACK);
        STAR_shape.setFill(new Color(1, 0, 0, 0));
        STAR_key.getChildren().addAll(STAR_shape, STAR_label);

        RSHIFT_key = new StackPane();
        Text RSHIFT_label = new Text("⇧");
        Rectangle RSHIFT_shape = new Rectangle(72, 25);
        RSHIFT_shape.setStroke(Color.BLACK);
        RSHIFT_shape.setFill(new Color(1, 0, 0, 0));
        RSHIFT_key.getChildren().addAll(RSHIFT_shape, RSHIFT_label);
        //PLUS_key;
        //APOS_key;
        //BACKSPACE_key;


        //BOTTOM ROW
        LCTRL_key = new StackPane();
        Text LCTRL_label = new Text("Ctrl");
        Rectangle LCTRL_shape = new Rectangle(35, 25);
        LCTRL_shape.setStroke(Color.BLACK);
        LCTRL_shape.setFill(new Color(1, 0, 0, 0));
        LCTRL_key.getChildren().addAll(LCTRL_shape, LCTRL_label);

        LWIN_key = new StackPane();
        Text LWIN_label = new Text("Win");
        Rectangle LWIN_shape = new Rectangle(30, 25);
        LWIN_shape.setStroke(Color.BLACK);
        LWIN_shape.setFill(new Color(1, 0, 0, 0));
        LWIN_key.getChildren().addAll(LWIN_shape, LWIN_label);

        LALT_key = new StackPane();
        Text LALT_label = new Text("Alt");
        Rectangle LALT_shape = new Rectangle(30, 25);
        LALT_shape.setStroke(Color.BLACK);
        LALT_shape.setFill(new Color(1, 0, 0, 0));
        LALT_key.getChildren().addAll(LALT_shape, LALT_label);

        SPACE_key = new StackPane();
        Text SPACE_label = new Text("");
        Rectangle SPACE_shape = new Rectangle(150, 25);
        SPACE_shape.setStroke(Color.BLACK);
        SPACE_shape.setFill(new Color(1, 0, 0, 0));
        SPACE_key.getChildren().addAll(SPACE_shape, SPACE_label);

        RALT_key = new StackPane();
        Text RALT_label = new Text("Alt");
        Rectangle RALT_shape = new Rectangle(30, 25);
        RALT_shape.setStroke(Color.BLACK);
        RALT_shape.setFill(new Color(1, 0, 0, 0));
        RALT_key.getChildren().addAll(RALT_shape, RALT_label);

        RWIN_key = new StackPane();
        Text RWIN_label = new Text("Win");
        Rectangle RWIN_shape = new Rectangle(30, 25);
        RWIN_shape.setStroke(Color.BLACK);
        RWIN_shape.setFill(new Color(1, 0, 0, 0));
        RWIN_key.getChildren().addAll(RWIN_shape, RWIN_label);

        MENU_key = new StackPane();
        Text MENU_label = new Text("[]");
        Rectangle MENU_shape = new Rectangle(37, 25);
        MENU_shape.setStroke(Color.BLACK);
        MENU_shape.setFill(new Color(1, 0, 0, 0));
        MENU_key.getChildren().addAll(MENU_shape, MENU_label);

        RCTRL_key = new StackPane();
        Text RCTRL_label = new Text("Ctrl");
        Rectangle RCTRL_shape = new Rectangle(45, 25);
        RCTRL_shape.setStroke(Color.BLACK);
        RCTRL_shape.setFill(new Color(1, 0, 0, 0));
        RCTRL_key.getChildren().addAll(RCTRL_shape, RCTRL_label);




        //RWIN_key;
        //RALT_key;
        //SPACE_key;




        /**ZEROTH ROW */
        ONE_key = new StackPane();
        Text ONE_label = new Text("1");
        Rectangle ONE_shape = new Rectangle(25, 25);
        ONE_shape.setStroke(Color.BLACK);
        ONE_shape.setFill(new Color(1, 0, 0, 0));
        ONE_key.getChildren().addAll(ONE_shape, ONE_label);

        TWO_key = new StackPane();
        Text TWO_label = new Text("2");
        Rectangle TWO_shape = new Rectangle(25, 25);
        TWO_shape.setStroke(Color.BLACK);
        TWO_shape.setFill(new Color(1, 0, 0, 0));
        TWO_key.getChildren().addAll(TWO_shape, TWO_label);

        THREE_key = new StackPane();
        Text THREE_label = new Text("3");
        Rectangle THREE_shape = new Rectangle(25, 25);
        THREE_shape.setStroke(Color.BLACK);
        THREE_shape.setFill(new Color(1, 0, 0, 0));
        THREE_key.getChildren().addAll(THREE_shape, THREE_label);

        FOUR_key = new StackPane();
        Text FOUR_label = new Text("4");
        Rectangle FOUR_shape = new Rectangle(25, 25);
        FOUR_shape.setStroke(Color.BLACK);
        FOUR_shape.setFill(new Color(1, 0, 0, 0));
        FOUR_key.getChildren().addAll(FOUR_shape, FOUR_label);

        FIVE_key = new StackPane();
        Text FIVE_label = new Text("5");
        Rectangle FIVE_shape = new Rectangle(25, 25);
        FIVE_shape.setStroke(Color.BLACK);
        FIVE_shape.setFill(new Color(1, 0, 0, 0));
        FIVE_key.getChildren().addAll(FIVE_shape, FIVE_label);

        SIX_key = new StackPane();
        Text SIX_label = new Text("6");
        Rectangle SIX_shape = new Rectangle(25, 25);
        SIX_shape.setStroke(Color.BLACK);
        SIX_shape.setFill(new Color(1, 0, 0, 0));
        SIX_key.getChildren().addAll(SIX_shape, SIX_label);

        SEVEN_key = new StackPane();
        Text SEVEN_label = new Text("7");
        Rectangle SEVEN_shape = new Rectangle(25, 25);
        SEVEN_shape.setStroke(Color.BLACK);
        SEVEN_shape.setFill(new Color(1, 0, 0, 0));
        SEVEN_key.getChildren().addAll(SEVEN_shape, SEVEN_label);

        EIGHT_key = new StackPane();
        Text EIGHT_label = new Text("8");
        Rectangle EIGHT_shape = new Rectangle(25, 25);
        EIGHT_shape.setStroke(Color.BLACK);
        EIGHT_shape.setFill(new Color(1, 0, 0, 0));
        EIGHT_key.getChildren().addAll(EIGHT_shape, EIGHT_label);

        NINE_key = new StackPane();
        Text NINE_label = new Text("9");
        Rectangle NINE_shape = new Rectangle(25, 25);
        NINE_shape.setStroke(Color.BLACK);
        NINE_shape.setFill(new Color(1, 0, 0, 0));
        NINE_key.getChildren().addAll(NINE_shape, NINE_label);

        ZERO_key = new StackPane();
        Text ZERO_label = new Text("0");
        Rectangle ZERO_shape = new Rectangle(25, 25);
        ZERO_shape.setStroke(Color.BLACK);
        ZERO_shape.setFill(new Color(1, 0, 0, 0));
        ZERO_key.getChildren().addAll(ZERO_shape, ZERO_label);

        /**FIRST ROW */
        Q_key = new StackPane();
        Text Q_label = new Text("Q");
        Rectangle Q_shape = new Rectangle(25, 25);
        Q_shape.setStroke(Color.BLACK);
        Q_shape.setFill(new Color(1, 0, 0, 0));
        Q_key.getChildren().addAll(Q_shape, Q_label);

        W_key = new StackPane();
        Text W_label = new Text("W");
        Rectangle W_shape = new Rectangle(25, 25);
        W_shape.setStroke(Color.BLACK);
        W_shape.setFill(new Color(1, 0, 0, 0));
        W_key.getChildren().addAll(W_shape, W_label);

        E_key = new StackPane();
        Text E_label = new Text("E");
        Rectangle E_shape = new Rectangle(25, 25);
        E_shape.setStroke(Color.BLACK);
        E_shape.setFill(new Color(1, 0, 0, 0));
        E_key.getChildren().addAll(E_shape, E_label);

        R_key = new StackPane();
        Text R_label = new Text("R");
        Rectangle R_shape = new Rectangle(25, 25);
        R_shape.setStroke(Color.BLACK);
        R_shape.setFill(new Color(1, 0, 0, 0));
        R_key.getChildren().addAll(R_shape, R_label);

        T_key = new StackPane();
        Text T_label = new Text("T");
        Rectangle T_shape = new Rectangle(25, 25);
        T_shape.setStroke(Color.BLACK);
        T_shape.setFill(new Color(1, 0, 0, 0));
        T_key.getChildren().addAll(T_shape, T_label);

        Y_key = new StackPane();
        Text Y_label = new Text("Y");
        Rectangle Y_shape = new Rectangle(25, 25);
        Y_shape.setStroke(Color.BLACK);
        Y_shape.setFill(new Color(1, 0, 0, 0));
        Y_key.getChildren().addAll(Y_shape, Y_label);

        U_key = new StackPane();
        Text U_label = new Text("U");
        Rectangle U_shape = new Rectangle(25, 25);
        U_shape.setStroke(Color.BLACK);
        U_shape.setFill(new Color(1, 0, 0, 0));
        U_key.getChildren().addAll(U_shape, U_label);

        I_key = new StackPane();
        Text I_label = new Text("I");
        Rectangle I_shape = new Rectangle(25, 25);
        I_shape.setStroke(Color.BLACK);
        I_shape.setFill(new Color(1, 0, 0, 0));
        I_key.getChildren().addAll(I_shape, I_label);

        O_key = new StackPane();
        Text O_label = new Text("O");
        Rectangle O_shape = new Rectangle(25, 25);
        O_shape.setStroke(Color.BLACK);
        O_shape.setFill(new Color(1, 0, 0, 0));
        O_key.getChildren().addAll(O_shape, O_label);

        P_key = new StackPane();
        Text P_label = new Text("P");
        Rectangle P_shape = new Rectangle(25, 25);
        P_shape.setStroke(Color.BLACK);
        P_shape.setFill(new Color(1, 0, 0, 0));
        P_key.getChildren().addAll(P_shape, P_label);

        Å_key = new StackPane();
        Text Å_label = new Text("Å");
        Rectangle Å_shape = new Rectangle(25, 25);
        Å_shape.setStroke(Color.BLACK);
        Å_shape.setFill(new Color(1, 0, 0, 0));
        Å_key.getChildren().addAll(Å_shape, Å_label);


        /**SECOND ROW   */
        A_key = new StackPane();
        Text A_label = new Text("A");
        Rectangle A_shape = new Rectangle(25, 25);
        A_shape.setStroke(Color.BLACK);
        A_shape.setFill(new Color(1, 0, 0, 0));
        A_key.getChildren().addAll(A_shape, A_label);

        S_key = new StackPane();
        Text S_label = new Text("S");
        Rectangle S_shape = new Rectangle(25, 25);
        S_shape.setStroke(Color.BLACK);
        S_shape.setFill(new Color(1, 0, 0, 0));
        S_key.getChildren().addAll(S_shape, S_label);

        D_key = new StackPane();
        Text D_label = new Text("D");
        Rectangle D_shape = new Rectangle(25, 25);
        D_shape.setStroke(Color.BLACK);
        D_shape.setFill(new Color(1, 0, 0, 0));
        D_key.getChildren().addAll(D_shape, D_label);

        F_key = new StackPane();
        Text F_label = new Text("F");
        Rectangle F_shape = new Rectangle(25, 25);
        F_shape.setStroke(Color.BLACK);
        F_shape.setFill(new Color(1, 0, 0, 0));
        F_key.getChildren().addAll(F_shape, F_label);

        G_key = new StackPane();
        Text G_label = new Text("G");
        Rectangle G_shape = new Rectangle(25, 25);
        G_shape.setStroke(Color.BLACK);
        G_shape.setFill(new Color(1, 0, 0, 0));
        G_key.getChildren().addAll(G_shape, G_label);

        H_key = new StackPane();
        Text H_label = new Text("H");
        Rectangle H_shape = new Rectangle(25, 25);
        H_shape.setStroke(Color.BLACK);
        H_shape.setFill(new Color(1, 0, 0, 0));
        H_key.getChildren().addAll(H_shape, H_label);

        J_key = new StackPane();
        Text J_label = new Text("J");
        Rectangle J_shape = new Rectangle(25, 25);
        J_shape.setStroke(Color.BLACK);
        J_shape.setFill(new Color(1, 0, 0, 0));
        J_key.getChildren().addAll(J_shape, J_label);

        K_key = new StackPane();
        Text K_label = new Text("K");
        Rectangle K_shape = new Rectangle(25, 25);
        K_shape.setStroke(Color.BLACK);
        K_shape.setFill(new Color(1, 0, 0, 0));
        K_key.getChildren().addAll(K_shape, K_label);

        L_key = new StackPane();
        Text L_label = new Text("L");
        Rectangle L_shape = new Rectangle(25, 25);
        L_shape.setStroke(Color.BLACK);
        L_shape.setFill(new Color(1, 0, 0, 0));
        L_key.getChildren().addAll(L_shape, L_label);

        Ø_key = new StackPane();
        Text Ø_label = new Text("Ø");
        Rectangle Ø_shape = new Rectangle(25, 25);
        Ø_shape.setStroke(Color.BLACK);
        Ø_shape.setFill(new Color(1, 0, 0, 0));
        Ø_key.getChildren().addAll(Ø_shape, Ø_label);

        Æ_key = new StackPane();
        Text Æ_label = new Text("Æ");
        Rectangle Æ_shape = new Rectangle(25, 25);
        Æ_shape.setStroke(Color.BLACK);
        Æ_shape.setFill(new Color(1, 0, 0, 0));
        Æ_key.getChildren().addAll(Æ_shape, Æ_label);


        /**THIRD ROW */
        Z_key = new StackPane();
        Text Z_label = new Text("Z");
        Rectangle Z_shape = new Rectangle(25, 25);
        Z_shape.setStroke(Color.BLACK);
        Z_shape.setFill(new Color(1, 0, 0, 0));
        Z_key.getChildren().addAll(Z_shape, Z_label);

        X_key = new StackPane();
        Text X_label = new Text("X");
        Rectangle X_shape = new Rectangle(25, 25);
        X_shape.setStroke(Color.BLACK);
        X_shape.setFill(new Color(1, 0, 0, 0));
        X_key.getChildren().addAll(X_shape, X_label);

        C_key = new StackPane();
        Text C_label = new Text("C");
        Rectangle C_shape = new Rectangle(25, 25);
        C_shape.setStroke(Color.BLACK);
        C_shape.setFill(new Color(1, 0, 0, 0));
        C_key.getChildren().addAll(C_shape, C_label);

        V_key = new StackPane();
        Text V_label = new Text("V");
        Rectangle V_shape = new Rectangle(25, 25);
        V_shape.setStroke(Color.BLACK);
        V_shape.setFill(new Color(1, 0, 0, 0));
        V_key.getChildren().addAll(V_shape, V_label);

        B_key = new StackPane();
        Text B_label = new Text("B");
        Rectangle B_shape = new Rectangle(25, 25);
        B_shape.setStroke(Color.BLACK);
        B_shape.setFill(new Color(1, 0, 0, 0));
        B_key.getChildren().addAll(B_shape, B_label);

        N_key = new StackPane();
        Text N_label = new Text("N");
        Rectangle N_shape = new Rectangle(25, 25);
        N_shape.setStroke(Color.BLACK);
        N_shape.setFill(new Color(1, 0, 0, 0));
        N_key.getChildren().addAll(N_shape, N_label);

        M_key = new StackPane();
        Text M_label = new Text("M");
        Rectangle M_shape = new Rectangle(25, 25);
        M_shape.setStroke(Color.BLACK);
        M_shape.setFill(new Color(1, 0, 0, 0));
        M_key.getChildren().addAll(M_shape, M_label);

    }

    public VBox getModel(){
        VBox keyboard = new VBox();
        int s = 1;

        HBox row0 = new HBox();
        row0.setSpacing(s);
        row0.setPadding(new Insets(s, 0, 0, 1));
        row0.getChildren().addAll(TILDA_key, ONE_key, TWO_key, THREE_key, FOUR_key, FIVE_key, SIX_key, SEVEN_key, EIGHT_key, NINE_key, ZERO_key, PLUS_key, APOS_key, BACKSPACE_key);

        HBox row1 = new HBox();
        row1.setSpacing(s);
        row1.setPadding(new Insets(s, 0, 0, 1));
        row1.getChildren().addAll(TAB_key, Q_key, W_key, E_key, R_key, T_key, Y_key, U_key, I_key, O_key, P_key, Å_key, CARET_key, ENTER_key);

        HBox row2 = new HBox();
        row2.setSpacing(s);
        row2.setPadding(new Insets(s, 0, 0, 1));
        row2.getChildren().addAll(CAPS_key, A_key, S_key, D_key, F_key, G_key, H_key, J_key, K_key, L_key, Ø_key, Æ_key, STAR_key, ENTER2_key);

        HBox row3 = new HBox();
        row3.setSpacing(s);
        row3.setPadding(new Insets(s, 0, 0, 1));
        row3.getChildren().addAll(LSHIFT_key, ANGLE_key, Z_key, X_key, C_key, V_key, B_key, N_key, M_key, COMMA_key, DOT_key, DASH_key, RSHIFT_key);

        HBox row4 = new HBox();
        row4.setSpacing(s);
        row4.setPadding(new Insets(s, 0, 0, 1));
        row4.getChildren().addAll(LCTRL_key, LWIN_key, LALT_key, SPACE_key, RALT_key, RWIN_key, MENU_key, RCTRL_key);




        keyboard.getChildren().addAll(row0, row1, row2, row3, row4);
        return keyboard;
    }


    public void recolour(){
        /**FIRST ROW */
        Rectangle Q_shape = (Rectangle) Q_key.getChildren().get(0);
        Rectangle W_shape = (Rectangle) W_key.getChildren().get(0);
        Rectangle E_shape = (Rectangle) E_key.getChildren().get(0);
        Rectangle R_shape = (Rectangle) R_key.getChildren().get(0);
        Rectangle T_shape = (Rectangle) T_key.getChildren().get(0);
        Rectangle Y_shape = (Rectangle) Y_key.getChildren().get(0);
        Rectangle U_shape = (Rectangle) U_key.getChildren().get(0);
        Rectangle I_shape = (Rectangle) I_key.getChildren().get(0);
        Rectangle O_shape = (Rectangle) O_key.getChildren().get(0);
        Rectangle P_shape = (Rectangle) P_key.getChildren().get(0);
        Rectangle Å_shape = (Rectangle) Å_key.getChildren().get(0);

        /**SECOND ROW */
        Rectangle A_shape = (Rectangle) A_key.getChildren().get(0);
        Rectangle S_shape = (Rectangle) S_key.getChildren().get(0);
        Rectangle D_shape = (Rectangle) D_key.getChildren().get(0);
        Rectangle F_shape = (Rectangle) F_key.getChildren().get(0);
        Rectangle G_shape = (Rectangle) G_key.getChildren().get(0);
        Rectangle H_shape = (Rectangle) H_key.getChildren().get(0);
        Rectangle J_shape = (Rectangle) J_key.getChildren().get(0);
        Rectangle K_shape = (Rectangle) K_key.getChildren().get(0);
        Rectangle L_shape = (Rectangle) L_key.getChildren().get(0);
        Rectangle Ø_shape = (Rectangle) Ø_key.getChildren().get(0);
        Rectangle Æ_shape = (Rectangle) Æ_key.getChildren().get(0);

        /**THIRD ROW*/
        Rectangle Z_shape = (Rectangle) Z_key.getChildren().get(0);
        Rectangle X_shape = (Rectangle) X_key.getChildren().get(0);
        Rectangle C_shape = (Rectangle) C_key.getChildren().get(0);
        Rectangle V_shape = (Rectangle) V_key.getChildren().get(0);
        Rectangle B_shape = (Rectangle) B_key.getChildren().get(0);
        Rectangle N_shape = (Rectangle) N_key.getChildren().get(0);
        Rectangle M_shape = (Rectangle) M_key.getChildren().get(0);

        /**FIRST ROW*/
        Q_shape.setFill(new Color(1, 1 - kb.getRedness("Q"), 1 - kb.getRedness("Q"), 1));
        W_shape.setFill(new Color(1, 1 - kb.getRedness("W"), 1 - kb.getRedness("W"), 1));
        E_shape.setFill(new Color(1, 1 - kb.getRedness("E"), 1 - kb.getRedness("E"), 1));
        R_shape.setFill(new Color(1, 1 - kb.getRedness("R"), 1 - kb.getRedness("R"), 1));
        T_shape.setFill(new Color(1, 1 - kb.getRedness("T"), 1 - kb.getRedness("T"), 1));
        Y_shape.setFill(new Color(1, 1 - kb.getRedness("Y"), 1 - kb.getRedness("Y"), 1));
        U_shape.setFill(new Color(1, 1 - kb.getRedness("U"), 1 - kb.getRedness("U"), 1));
        I_shape.setFill(new Color(1, 1 - kb.getRedness("I"), 1 - kb.getRedness("I"), 1));
        O_shape.setFill(new Color(1, 1 - kb.getRedness("O"), 1 - kb.getRedness("O"), 1));
        P_shape.setFill(new Color(1, 1 - kb.getRedness("P"), 1 - kb.getRedness("P"), 1));
        Å_shape.setFill(new Color(1, 1 - kb.getRedness("Å"), 1 - kb.getRedness("Å"), 1));

        /**SECOND ROW*/
        A_shape.setFill(new Color(1, 1 - kb.getRedness("A"), 1 - kb.getRedness("A"), 1));
        S_shape.setFill(new Color(1, 1 - kb.getRedness("S"), 1 - kb.getRedness("S"), 1));
        D_shape.setFill(new Color(1, 1 - kb.getRedness("D"), 1 - kb.getRedness("D"), 1));
        F_shape.setFill(new Color(1, 1 - kb.getRedness("F"), 1 - kb.getRedness("F"), 1));
        G_shape.setFill(new Color(1, 1 - kb.getRedness("G"), 1 - kb.getRedness("G"), 1));
        H_shape.setFill(new Color(1, 1 - kb.getRedness("H"), 1 - kb.getRedness("H"), 1));
        J_shape.setFill(new Color(1, 1 - kb.getRedness("J"), 1 - kb.getRedness("J"), 1));
        K_shape.setFill(new Color(1, 1 - kb.getRedness("K"), 1 - kb.getRedness("K"), 1));
        L_shape.setFill(new Color(1, 1 - kb.getRedness("L"), 1 - kb.getRedness("L"), 1));
        Ø_shape.setFill(new Color(1, 1 - kb.getRedness("Ø"), 1 - kb.getRedness("Ø"), 1));
        Æ_shape.setFill(new Color(1, 1 - kb.getRedness("Æ"), 1 - kb.getRedness("Æ"), 1));

        /**THIRD ROW */
        Z_shape.setFill(new Color(1, 1 - kb.getRedness("Z"), 1 - kb.getRedness("Z"), 1));
        X_shape.setFill(new Color(1, 1 - kb.getRedness("X"), 1 - kb.getRedness("X"), 1));
        C_shape.setFill(new Color(1, 1 - kb.getRedness("C"), 1 - kb.getRedness("C"), 1));
        V_shape.setFill(new Color(1, 1 - kb.getRedness("V"), 1 - kb.getRedness("V"), 1));
        B_shape.setFill(new Color(1, 1 - kb.getRedness("B"), 1 - kb.getRedness("B"), 1));
        N_shape.setFill(new Color(1, 1 - kb.getRedness("N"), 1 - kb.getRedness("N"), 1));
        M_shape.setFill(new Color(1, 1 - kb.getRedness("M"), 1 - kb.getRedness("M"), 1));
    }

    public void clear(){
        /**FIRST ROW */
        Rectangle Q_shape = (Rectangle) Q_key.getChildren().get(0);
        Rectangle W_shape = (Rectangle) W_key.getChildren().get(0);
        Rectangle E_shape = (Rectangle) E_key.getChildren().get(0);
        Rectangle R_shape = (Rectangle) R_key.getChildren().get(0);
        Rectangle T_shape = (Rectangle) T_key.getChildren().get(0);
        Rectangle Y_shape = (Rectangle) Y_key.getChildren().get(0);
        Rectangle U_shape = (Rectangle) U_key.getChildren().get(0);
        Rectangle I_shape = (Rectangle) I_key.getChildren().get(0);
        Rectangle O_shape = (Rectangle) O_key.getChildren().get(0);
        Rectangle P_shape = (Rectangle) P_key.getChildren().get(0);
        Rectangle Å_shape = (Rectangle) Å_key.getChildren().get(0);

        /**SECOND ROW */
        Rectangle A_shape = (Rectangle) A_key.getChildren().get(0);
        Rectangle S_shape = (Rectangle) S_key.getChildren().get(0);
        Rectangle D_shape = (Rectangle) D_key.getChildren().get(0);
        Rectangle F_shape = (Rectangle) F_key.getChildren().get(0);
        Rectangle G_shape = (Rectangle) G_key.getChildren().get(0);
        Rectangle H_shape = (Rectangle) H_key.getChildren().get(0);
        Rectangle J_shape = (Rectangle) J_key.getChildren().get(0);
        Rectangle K_shape = (Rectangle) K_key.getChildren().get(0);
        Rectangle L_shape = (Rectangle) L_key.getChildren().get(0);
        Rectangle Ø_shape = (Rectangle) Ø_key.getChildren().get(0);
        Rectangle Æ_shape = (Rectangle) Æ_key.getChildren().get(0);

        /**THIRD ROW*/
        Rectangle Z_shape = (Rectangle) Z_key.getChildren().get(0);
        Rectangle X_shape = (Rectangle) X_key.getChildren().get(0);
        Rectangle C_shape = (Rectangle) C_key.getChildren().get(0);
        Rectangle V_shape = (Rectangle) V_key.getChildren().get(0);
        Rectangle B_shape = (Rectangle) B_key.getChildren().get(0);
        Rectangle N_shape = (Rectangle) N_key.getChildren().get(0);
        Rectangle M_shape = (Rectangle) M_key.getChildren().get(0);

        /**FIRST ROW*/
        Q_shape.setFill(new Color(1, 1, 1, 1));
        W_shape.setFill(new Color(1, 1, 1, 1));
        E_shape.setFill(new Color(1, 1, 1, 1));
        R_shape.setFill(new Color(1, 1, 1, 1));
        T_shape.setFill(new Color(1, 1, 1, 1));
        Y_shape.setFill(new Color(1, 1, 1, 1));
        U_shape.setFill(new Color(1, 1, 1, 1));
        I_shape.setFill(new Color(1, 1, 1, 1));
        O_shape.setFill(new Color(1, 1, 1, 1));
        P_shape.setFill(new Color(1, 1, 1, 1));
        Å_shape.setFill(new Color(1, 1, 1, 1));

        /**SECOND ROW*/
        A_shape.setFill(new Color(1, 1, 1, 1));
        S_shape.setFill(new Color(1, 1, 1, 1));
        D_shape.setFill(new Color(1, 1, 1, 1));
        F_shape.setFill(new Color(1, 1, 1, 1));
        G_shape.setFill(new Color(1, 1, 1, 1));
        H_shape.setFill(new Color(1, 1, 1, 1));
        J_shape.setFill(new Color(1, 1, 1, 1));
        K_shape.setFill(new Color(1, 1, 1, 1));
        L_shape.setFill(new Color(1, 1, 1, 1));
        Ø_shape.setFill(new Color(1, 1, 1, 1));
        Æ_shape.setFill(new Color(1, 1, 1, 1));

        /**THIRD ROW */
        Z_shape.setFill(new Color(1, 1, 1, 1));
        X_shape.setFill(new Color(1, 1, 1, 1));
        C_shape.setFill(new Color(1, 1, 1, 1));
        V_shape.setFill(new Color(1, 1, 1, 1));
        B_shape.setFill(new Color(1, 1, 1, 1));
        N_shape.setFill(new Color(1, 1, 1, 1));
        M_shape.setFill(new Color(1, 1, 1, 1));
    }
}

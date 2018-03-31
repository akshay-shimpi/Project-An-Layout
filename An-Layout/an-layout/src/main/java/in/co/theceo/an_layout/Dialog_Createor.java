package in.co.theceo.an_layout;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

/**
 * Created by Akshay_Shimpi on 27-Mar-18.
 */

public class Dialog_Createor {

    public static int DEFAULT_ANIMATION = 0;
    public static int FROM_LEFT_TO_LEFT_ANIMATION = R.style.DialogTheme_FLTL;
    public static int FROM_RIGHT_TO_RIGHT_ANIMATION = R.style.DialogTheme_FRTR;
    public static int ROTATION_IN_ANIMATION = R.style.DialogTheme_ROTATION_IN;
    public static int ROTATION_IN_OUT_ANIMATION = R.style.DialogTheme_ROTATION_IN_OUT;
    public static int FADE_IN_ANIMATION = R.style.DialogTheme_FAIND_IN;
    public static int FADE_IN_OUT_ANIMATION = R.style.DialogTheme_FAIND_IN_OUT;
    public static int ENTER_EXIT_ANIMATION = R.style.DialogTheme_ENTER_EXIT;
    public static int ENTER_ANIMATION = R.style.DialogTheme_ENTER;
    public static int UP_ANIMATION = R.style.DialogTheme_UP;
    public static int UP_DOWN_ANIMATION = R.style.DialogTheme_UP_DOWN;
    public static int FROM_TOP_ANIMATION = R.style.DialogTheme_TOP_MIDDLE;
    public static int FROM_TOP_TO_TOP_ANIMATION = R.style.DialogTheme_FROM_TOP_TO_TOP;
    public static int FROM_TOP_TO_BOTTOM_ANIMATION = R.style.DialogTheme_FROM_TOP_TO_BOTTOM;

    public static Dialog Create_Custom_Popup(Context c, int Layout, int Anim_Type) {
        Dialog dialog = new Dialog(c);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(Layout);
        if (Anim_Type != 0) {
            dialog.getWindow().getAttributes().windowAnimations = Anim_Type;
        }
        return dialog;
    }
}

package womenflatstomachworkout.workoutapps.abs.workout.belly.tost;

import android.content.Context;
import android.widget.Toast;

public class simpletost {

    public void Tost(Context activty,String mess){
        Toast.makeText(activty, ""+mess, Toast.LENGTH_SHORT).show();

    }
}

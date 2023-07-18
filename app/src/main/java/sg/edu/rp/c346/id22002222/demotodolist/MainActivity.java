package sg.edu.rp.c346.id22002222.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<ToDoItem> alToDo;
    ArrayAdapter<ToDoItem> aaToDo;

    CustomAdapter caToDo;

//    ArrayList<>;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.lvTodo);
        alToDo = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8,2);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for hair cut", date2);
        alToDo.add(item1);
        alToDo.add(item2);

        caToDo = new CustomAdapter(this, R.layout.row, alToDo);

        lvTodo.setAdapter(caToDo);

//        ToDoItem item1 = new ToDoItem("Go for movie", );
    }
}
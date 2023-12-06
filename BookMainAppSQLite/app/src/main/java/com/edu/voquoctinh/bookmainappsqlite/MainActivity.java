package com.edu.voquoctinh.bookmainappsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase dbSach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tạo cơ sở dữ liệu
        dbSach = openOrCreateDatabase("QuanLySach.db",
                MODE_PRIVATE,
                null);
        //DataDemo();
    }// het Oncreate
    void DataDemo(){
        // Tạo bảng BOOKS
        //* chú ý xóa bảng nếu tồn tại
        dbSach.execSQL("DROP TABLE IF EXISTS BOOKS");
        String sqlTaoBangBook = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY, " +
                "BookName text, " +
                "Page integer, " +
                "Price Float, " +
                "Description text )";
        dbSach.execSQL(sqlTaoBangBook);
        dbSach.close();
        // Chèn 1 bản ghi
        String sqlThem = "INSERT INTO BOOKS VALUES(1," +
                "'Lập trình Java'," +
                "100, " +
                "9.99, " +
                "'Lập trình Java của NXB ABC'" +
                ")";
        dbSach.execSQL(sqlThem);
        String sqlThem1 = "INSERT INTO BOOKS VALUES(2," +
                "'Lập trình Android'," +
                "99, " +
                "12.09, " +
                "'Giaos Trình Android toàn tập'" +
                ")";
        dbSach.execSQL(sqlThem1);
        String sqlThem2 = "INSERT INTO BOOKS VALUES(3," +
                "'Lập trình Android'," +
                "99, " +
                "12.09, " +
                "'Giaos Trình Android toàn tập'" +
                ")";
        dbSach.execSQL(sqlThem2);
    }
}
package com.example.crud;

public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.1.6/Android/mahasiswa/tambahMhw.php";
    public static final String URL_GET_ALL = "http://192.168.1.6/Android/mahasiswa/tampilSemuaMhw.php";
    public static final String URL_GET_MHW = "http://192.168.1.6/Android/mahasiswa/tampilMhw.php?id=";
    public static final String URL_UPDATE_MHW = "http://192.168.1.6/Android/mahasiswa/updateMhw.php";
    public static final String URL_DELETE_MHW = "http://192.168.1.6/Android/mahasiswa/hapusMhw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_JURUSAN = "jurusan";
    public static final String KEY_EMP_EMAIL = "email";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";


    public static final String MHW_ID = "mhw_id";
}

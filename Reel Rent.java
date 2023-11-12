import java.util.Date;


interface MetodePembayaran {
    void prosesPembayaran(double jumlah);
}


abstract class Film {
    private int idFilm;
    private String judul;
    private String genre;
    private double harga;

    
}


class FilmDigital extends Film {
    private String resolusi;
    private String format;

    
}


class FilmFisik extends Film {
    private int stock;
    private double berat;

    
}


class Penyewa {
    private int idPenyewa;
    private String nama;
    private String alamat;
    private String nomorTelp;

    
}


class PenyewaVIP extends Penyewa {
    private double diskon;

   
}


class MetodePembayaranImpl implements MetodePembayaran {
    private int idMetode;
    private String jenis;

    

    @Override
    public void prosesPembayaran(double jumlah) {
        // Implementasi proses pembayaran
    }
}


class Penyewaan {
    private int idPenyewaan;
    private Date tanggal;
    private String status;
    private double totalPembayaran;

    
    private Penyewa penyewa;

   
    private MetodePembayaran metodePembayaran;

   
    private DetailPenyewaan[] detailPenyewaan;

    
}


class DetailPenyewaan {
    private int jumlah;
    private double subTotal;

   
    private Film film;

   
}

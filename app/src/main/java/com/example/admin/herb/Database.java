package com.example.admin.herb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 5/12/2559.
 */

public class Database extends SQLiteOpenHelper {
    private static final String DB_NAME = "herbs";
    private static final int DB_VERSION = 24;

    public static final String TABLE_NAME = "detailherbs";

    public static final String COL_THNAME = "c_name_th";
    public static final String COL_ENNAME = "c_name_en";
    public static final String COL_ORDINARY = "c_ordinary";
    public static final String COL_NAMESCIENCE = "c_namescience";
    public static final String COL_FAMILY = "c_family";
    public static  final String COL_PICTURE ="c_picture";

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME
                +" (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_THNAME + " TEXT, " + COL_ENNAME + " TEXT, "
                + COL_NAMESCIENCE + " TEXT, "
                + COL_FAMILY + " TEXT, "
                + COL_PICTURE + " TEXT);");
/*, " + COL_ORDER + " TEXT*/
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ขิง', 'Ginger', 'Zingiber officinale  Roscoe'" + ", 'ZINGIBERACEAE'" + ", 'ginger.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ไข่เน่า', 'Rottem Egg', 'Vitex glabrata R. Br.'" + ", 'VERBENACEAE' " + ", 'khainao.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('รางจืดต้น', 'Jued', 'crotalaria spectabilis Roth.'" + ", 'Fabaceae' " + ", 'langjeai.JPG');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ขนุน', 'Jackfruit', 'Artocarpus heterophyllus.'" + ", 'MORACEAE' " + ", 'jackfruit.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('โหระพา', 'Basil', 'Ocimum basilicum Linn.'" + ", 'LABIATAE' " + ", 'basil.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ผักชี', 'Coriander.', 'Coriandrum sativum.'" + ", 'Apiaceae.' " + ", 'Corainder.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY+",  "+COL_PICTURE +  ") VALUES ('ใบกระวาน', 'Bayleaf.', 'Laurus nobilis.'" + ", 'Lauraceae.' " + ", 'bayleaf.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('กุ่ยช่าย', 'Kooi yeah.', 'Allium tuberosum Rottl.'" + ", 'Amaryllidaceae.' " + ", 'kooiyeah.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ผักชีฝรั่ง', 'Parsley.', 'Eryngium foetidum.'" + ", 'Apiaceae.' " + ", 'Parsley.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ตะไคร้', 'Lemon Grass.', 'Cymbopogon citratus.'" + ", 'Poaceae.' " + ", 'LemonGrass.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('กระเจี๊ยบแดง', ' Roselle.','Hibiscus sabdariffa  L.'" + ", 'Malvaceae.' " + ", 'Roselle.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ทองกวาว', ' Bastard Teak.','Butea monosperma (Lam.) Taub'" + ", 'Leguminosae-Papilionoideae.' " + ", 'BastardTeak.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ทานตะวัน', ' Sunflower.','Helianthus annuus  L.'" + ", 'Asteraceae.' " + ", 'Sunflower.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('สับปะรด', ' Pineapple.','Ananas comosus  (L.) Merr.'" + ", 'Bromeliaceae.' " + ", 'Pineapple.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('มะขาม', ' Tamarind.','Tamarindus indica  L.'" + ", 'Leguminosae.' " + ", 'Tamarind.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ทับทิม', ' Punica apple.','Punica granatum  L.'" + ", 'Punicaceae.' " + ", 'Punicaapple.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('มะเฟือง', ' Star fruit.','Averrhoa carambola  L.'" + ", 'Averrhoaceae.' " + ", 'Starfruit.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('เตยหอม', ' Pandanus Palm.','Pandanus amaryllifolius  Roxb.'" + ", 'Pandanaceae.' " + ", 'PandanusPalm.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ใบบัวบก', ' Tiger Herbal.','Centella asiatica  Urban.'" + ", 'Umbelliferae.' " + ", 'TigerHerbal.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('พิกุล', ' Bullet wood.','Mimusops elengi  L.'" + ", 'Sapotaceae.' " + ", 'Bulletwood.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('บัวหลวง', ' Lotus.','Nelumbo nucifera Gaertn.'" + ", 'Nelumbonaceae.' " + ", 'Lotus.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('บอระเพ็ด', 'Tinospora crispa.','Tinospora crispa  (L.) Miers ex Hook.f.& Thomson.'"+", 'Menispermaceae.' " + ", 'Tinosporacrispa.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('สะเดา', 'Margosa.','Azadirachta indica A. Juss. var. siamensis  Valeton.'"+", 'Meliaceae.' " + ",'Margosa.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('แคดอกขาว แคดอกแดง', 'Vegetable humming bird.','Sesbania grandiflora  (L.) Desv.'"+", 'Leguminosae.' " + ", 'Vegetablehummingbird.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ว่านธรณีสาร', 'Phyllanthus pulcher.','Phyllanthus pulcher  Wall. ex Mull.Arg.'"+", 'Euphorbiaceae.' " + ", 'phyllanthuspulcher.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ฟ้าทะลายโจร', 'Kariyat.','Andrographis paniculata (Burm.f.) Wall.ex Nees.'"+", 'Acanthaceae.' " + ", 'Kariyat.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('เทียนบ้าน', 'Garden Balsam.','Impatiens balsamina L.'"+", 'Balsaminaceae.' " + ", 'GardenBalsam.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ผักบุ้งทะเล', 'Beach Morning Glory.','Ipomoea pes- caprae ( L.) R.br.'"+", 'Convolvulaceae.' " + ", 'BeachMorningGlory.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ว่านหางจระเข้', 'Aloe.','Aloe vera  (L.)  Burm.f.'"+", 'Asphodelaceae.' " + ", 'Aloe.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('เสลดพังพอนตัวผู้', 'Hop Headed Barleria.','Barleria lupulina Lindl.'"+", 'Acanthaceae.' " + ", 'Hop.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('พุดตาน', 'Cotton rose.','Hibiscus mutabilis  L.'"+", 'Malvaceae.' " + ", 'Cotton.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('มังคุด', 'Mangosteen.','Garcinia mangostana  L.'"+", 'Guttiferae.' " + ", 'Mangosteen.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('กัญชา', 'Indian Hemp.','Cannabis sativa  L.'"+", 'Canabaceae.' " + ", 'IndianHemp.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ขี้เหล็ก', 'Cassod tree.','Senna siamea  (Lam.) Irwin & Barneby.'"+", 'Ceasalpinioideae.' " + ", 'Cassodtree.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ชุมเห็ดไทย', 'Foetid Cassia.','Senna tora (L.) Roxb.'"+", 'Leguminosae.' " + ", 'FoetidCassia.jpg');");

        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('พวงชมพูดอกขาว', 'Confederate Vine.','Antigonon leptopus  Hook & Arn.'"+", 'Polygonaceae.' " + ", 'ConfederateVine.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ทองพันชั่ง', 'White crane flower.','Rhinacanthus nasutus  (L.) Kurz.'"+", 'Acanthaceae.' " + ", 'Whitecraneflower.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('แพงพวยฝรั่ง', 'Vinca.','Catharanthus roseus  (L.) G.Don.'"+", 'Apocynaceae.' " + ", 'Vinca.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('หญ้าปักกิ่ง', 'Indian Marsh Fleabane.','Pluchea indica (L.) Less.'"+", 'Asteraceae.'" + ", 'Indian.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ครอบฟันสี', 'Indian mallow.','Abutilon indicum (L.) Sweet.'"+", 'Malvaceae.' " + ", 'Indianmallow.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('กระทกรก', 'Fetid passionflower.','Passiflora foetida L.'"+", 'Passifloraceae.' " + ", 'Fetidpassionflower.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ยูคาลิป', 'Eucalyptus.','Eucalyptus globulus  Labill. (Eucalyptus citriodora Hook.).'"+", 'Myrtaceae.' " + ", 'Eucalyptus.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('มหาหงส์', 'Butterfly lily.','Hedychium coronarium J.KOnig.'"+", 'Zingiberaceae.' " + ", 'Butterflylily.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('น้อยหน่า', 'Sugar Apple.','Annona squamosa L.'"+", 'Annonaceae.' " + ", 'SugarApple.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ผกากรอง', 'Weeping Lantana.','Lantana camara  L.'"+", 'Verbebaceae.' " + ", 'w.JPG');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('กำลังพญาเสือโคร่ง', 'Birch.','Betula alnoides   Buch.- Ham.ex G.Don.'"+", 'Betulaceae.' " + ", 'Birch.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('มะระขี้นก', 'Balsum Pea.','Momordica charantia  L.'"+", 'Cucurbitaceae.' " + ", 'BalsumPea.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('สายน้ำผึ้ง', 'Honey Suckle.','Lonicera japonica Thunb.'"+", 'Caprifoliaceae.' " + ", 'HoneySuckle.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('ไพล', 'Z.purpureum  Roscoe.',' Zingiber montanum (Koenig) Link ex Dietr.'"+", 'Zingiberaceae.' " + ", 'Z.purpureum Roscoe.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('เถาเอ็นอ่อน', 'Cryptolepis buchanani.','Cryptolepis buchanani  Roem.&Schult.'"+", 'Asclepiadaceae.' " + ", 'Cryptolepisbuchanani.jpg');");
        db.execSQL("INSERT INTO "+ TABLE_NAME +" (" + COL_THNAME + ", " + COL_ENNAME + ", " + COL_NAMESCIENCE + ", " + COL_FAMILY +", "+COL_PICTURE +  ") VALUES ('มะนาว', 'Common lime.','Citrus aurantifolia (Christm.)  Swingle.'"+", 'Rutaceae.' " + ", 'limes.jpg');");

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion
            , int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
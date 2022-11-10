package com.dulali.quranmp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class SuraActivity extends AppCompatActivity {


    public static String sura_names[] = {"Al-Fatihah(ٱلْفَاتِحَة)" , "Al-Baqarah(ٱلْبَقَرَة)" ,"Aali 'Imran(آلِ عِمْرَان)" , "An-Nisa(ٱلنِّسَاء)" , "Al-Ma'idah(ٱلْمَائِدَة)" ,"Al-An'am(ٱلْأَنْعَام)" , "Al-A'raf(ٱلْأَعْرَاف)" , "Al-Anfal(ٱلْأَنْفَال)" ,
            "At-Tawbah(ٱلتَّوْبَة)" , "Yunus(يُونُس)", "Hud(هُود)" ,"Yusuf(يُوسُف)","Ar-Ra'd(ٱلرَّعْد)" ,"Ibrahim(إِبْرَاهِيم)","Al-Hijr(ٱلْحِجْر)" ,"An-Nahl(ٱلنَّحْل)","Al-Isra(ٱلْإِسْرَاء)","Al-Kahf(ٱلْكَهْف)","Maryam(مَرْيَم)",
            "Ta-Ha(طه)","Al-Anbiya(ٱلْأَنْبِيَاء)","Al-Hajj(ٱلْحَجّ)","Al-Mu'minun(ٱلْمُؤْمِنُون)","An-Nur(ٱلنُّور)","Al-Furqan(ٱلْفُرْقَان)","Ash-Shu'ara(ٱلشُّعَرَاء)","An-Naml(ٱلنَّمْل)", "Al-Qasas(ٱلْقَصَص)",
            "Al-Ankabut(ٱلْعَنْكَبُوت)","Ar-Rum(ٱلرُّوم)","Luqmaan(لُقْمَان)","As-Sajdah(ٱلسَّجْدَة)","Al-Ahzaab(ٱلْأَحْزَاب)","Saba (surah)(سَبَأ)","Faatir(فَاطِر)","Ya-Sin(يس)","As-Saaffaat(ٱلصَّافَّات)",
            "Saad(ص)","Az-Zumar(ٱلزُّمَر)","Ghafir(غَافِر)", "Fussilat(فُصِّلَت)","Ash-Shura(ٱلشُّورىٰ)","Az-Zukhruf(ٱلْزُّخْرُف)","Ad-Dukhaan(ٱلدُّخَان)","Al-Jaathiyah(ٱلْجَاثِيَة)","Al-Ahqaaf(ٱلْأَحْقَاف)",
            "Muhammad(مُحَمَّد)","Al-Fath(ٱلْفَتْح)","Al-Hujuraat(ٱلْحُجُرَات)","Qaaf(ق)","Adh-Dhaariyaat(ٱلذَّارِيَات)","At-Toor(ٱلطُّور)","An-Najm(ٱلنَّجْم)","Al-Qamar(ٱلْقَمَر)","Ar-Rahman(ٱلرَّحْمَٰن)",
            "Al-Waqi'ah(ٱلْوَاقِعَة)" ,"Al-Hadeed(ٱلْحَدِيد)","Al-Mujadila(ٱلْمُجَادِلَة)","Al-Hashr(ٱلْحَشْر)","Al-Mumtahanah(ٱلْمُمْتَحَنَة)","As-Saff(ٱلصَّفّ)","Al-Jumu'ah(ٱلْجُمُعَة)","Al-Munafiqoon(ٱلْمُنَافِقُون)","At-Taghabun(ٱلتَّغَابُن)",
            "At-Talaq(ٱلطَّلَاق)","At-Tahreem(ٱلتَّحْرِيم)","Al-Mulk(ٱلْمُلْك)","Al-Qalam(ٱلْقَلَم)","Al-Haaqqa(ٱلْحَاقَّة)","Al-Ma'aarij(ٱلْمَعَارِج)","Nuh(نُوح)","Al-Jinn(ٱلْجِنّ)","Al-Muzzammil(ٱلْمُزَّمِّل)","Al-Muddaththir(ٱلْمُدَّثِّر)",
            "Al-Qiyamah(ٱلْقِيَامَة)","Al-Insaan|Ad-Dahr(ٱلْإِنْسَان)","Al-Mursalaat(ٱلْمُرْسَلَات)","An-Naba'(ٱلنَّبَأ)","An-Naazi'aat(ٱلنَّازِعَات)","Abasa(عَبَسَ)","At-Takweer(ٱلتَّكْوِير)","Al-Infitar(ٱلْإِنْفِطَار)","Al-Mutaffifeen(ٱلْمُطَفِّفِين)",
            "Al-Inshiqaaq(ٱلْإِنْشِقَاق)","Al-Burooj(ٱلْبُرُوج)","At-Taariq(ٱلطَّارِق)","Al-A'la(ٱلْأَعْلَىٰ)","Al-Ghaashiyah(ٱلْغَاشِيَة)","Al-Fajr(ٱلْفَجْر)","Al-Balad(ٱلْبَلَد)","Ash-Shams(ٱلشَّمْس)","Al-Layl(ٱللَّيْل)","Ad-Dhuha(ٱلضُّحَىٰ)",
            "Ash-Sharh (Al-Inshirah)(ٱلشَّرْح)","At-Tin(ٱلتِّين)","Al-Alaq(ٱلْعَلَق)","Al-Qadr(ٱلْقَدْر)","Al-Bayyinah(ٱلْبَيِّنَة)","Az-Zalzalah(ٱلزَّلْزَلَة)","Al-'Aadiyat(ٱلْعَادِيَات)","Al-Qaari'ah(ٱلْقَارِعَة)","At-Takaathur(ٱلتَّكَاثُر)",
            "Al-'Asr(ٱلْعَصْر)","Al-Humazah(ٱلْهُمَزَة)","Al-Feel(ٱلْفِيل)","Quraish(قُرَيْش)","Al-Maa'oon(ٱلْمَاعُون)","Al-Kawthar(ٱلْكَوْثَر)","Al-Kaafiroon(ٱلْكَافِرُون)","An-Nasr(ٱلنَّصْر)","Al-Masad(ٱلْمَسَد)","Al-Ikhlas(ٱلْإِخْلَاص)",
            "Al-Falaq(ٱلْفَلَق)","An-Naas(ٱلنَّاس)"};
    GridView gridView;
    public static int j;
    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura);


        gridView = findViewById(R.id.gridView);

        MyAdapter adapter = new MyAdapter(getApplicationContext() , sura_names);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mediaPlayer = MediaPlayer.create(getApplicationContext() , R.raw.button);
                mediaPlayer.start();
                j = i;
                startActivity(new Intent(SuraActivity.this , PlaySuraActivity2.class));
            }
        });
    }
}
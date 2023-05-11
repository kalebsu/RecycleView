package com.kalebsuy.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.kalebsuy.recylerview.adapter.AdapterTeamBola
import com.kalebsuy.recylerview.databinding.ActivityMainBinding
import com.kalebsuy.recylerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Thibaut Courtois",R.drawable.courtois,"Penjaga Gawang", "2.00 m", "Bree (Belgia)", "11 Mei 1992"))
        listPemain.add(Pemain("Karim Benzema",R.drawable.benzema, "Penyerang", "1.85 m", "Lyon (Prancis)", "19 Desember 1987"))
        listPemain.add(Pemain("Marcelo Vieira da Silva", R.drawable.marcello, "LeftBack", "1.74 m", "Rio de Janeiro (Brasil)", "12 Mei 1988"))
        listPemain.add(Pemain("Sergio Ramos Garcia", R.drawable.ramos, "CentreBack", "1.84 m", "Camas(Sevilla)", "30 Maret 1986"))
        listPemain.add(Pemain("Zinedine Yazid Zidane", R.drawable.zidan, "Pelatih", "1.85 m", "Marseille (Prancis)", "23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola(this, listPemain, object : AdapterTeamBola.onClickListener{
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })

    }
}
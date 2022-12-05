package com.saiful.affirmation.data

import com.saiful.affirmation.R
import com.saiful.affirmation.model.Affirmation

class Datasource {
    fun loadAffirmation(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation("Mohammed Moinul Morshed Alvee", "ID No: T-30031", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Md. Asraful Alam", "ID No: T-30032", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Fazle Rabbi Khan", "ID No: T-30033", R.drawable.rabbi_30033, "Blood Group: N/A"),
            Affirmation("Sheikh Mustafizur Rahman", "ID No: T-30034", R.drawable.mustafuz_30034, "Blood Group: N/A"),
            Affirmation("RAIAN IBN FAIZ", "ID No: T-30035", R.drawable.raian_30035, "Blood Group: N/A"),
            Affirmation("Samiun Rahman Sizan", "ID No: T-30036", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Minhaz Uddin Ahmed", "ID No: T-30037", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Tamanna Afrose", "ID No: T-30038", R.drawable.default_avatar_woman, "Blood Group: N/A"),
            Affirmation("MD NUR UDDIN", "ID No: T-30039", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Mohammad Joynul Abedin", "ID No: T-30040", R.drawable.jounul_30040, "Blood Group: N/A"),
            Affirmation("Anoup Ghosh", "ID No: T-30041", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Sadman Abir", "ID No: T-30042", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Mahamudul Hasan Shajib", "ID No: T-30043", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Masrur Arefin Sadhin", "ID No: T-30044", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Syed Abdullah", "ID No: T-30045", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Saiful Islam", "ID No: T-30046", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Arnab Shanta Anu", "ID No: T-30047", R.drawable.default_avatar, "Blood Group: N/A"),
            Affirmation("Kamrul Hasan", "ID No: T-30048", R.drawable.kamrul_30048, "Blood Group: N/A"),
            Affirmation("Ihsan Md. Al-Aqib", "ID No: T-30049", R.drawable.ihsan_30049, "Blood Group: N/A"),
            Affirmation("sadab mostafa", "ID No: T-30050", R.drawable.default_avatar, "Blood Group: N/A")
        )
    }
}
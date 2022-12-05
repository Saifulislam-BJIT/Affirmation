package com.saiful.affirmation.data

import com.saiful.affirmation.model.Affirmation

class Datasource {
    fun loadAffirmation(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation("Mohammed Moinul Morshed Alvee", "Id: T-30031"),
            Affirmation("Md. Asraful Alam", "Id: T-30032"),
            Affirmation("Fazle Rabbi Khan", "Id: T-30033"),
            Affirmation("Sheikh Mustafizur Rahman", "Id: T-30034"),
            Affirmation("RAIAN IBN FAIZ", "Id: T-30035"),
            Affirmation("Samiun Rahman Sizan", "Id: T-30036"),
            Affirmation("Minhaz Uddin Ahmed", "Id: T-30037"),
            Affirmation("Tamanna Afrose", "Id: T-30038"),
            Affirmation("MD NUR UDDIN", "Id: T-30039"),
            Affirmation("Mohammad Joynul Abedin", "Id: T-30040"),
            Affirmation("Anoup Ghosh", "Id: T-30041"),
            Affirmation("Sadman Abir", "Id: T-30042"),
            Affirmation("Mahamudul Hasan Shajib", "Id: T-30043"),
            Affirmation("Masrur Arefin Sadhin", "Id: T-30044"),
            Affirmation("Syed Abdullah", "Id: T-30045"),
            Affirmation("Saiful Islam", "Id: T-30046"),
            Affirmation("Arnab Shanta Anu", "Id: T-30047"),
            Affirmation("Kamrul Hasan", "Id: T-30048"),
            Affirmation("Ihsan Md. Al-Aqib", "Id: T-30049"),
            Affirmation("sadab mostafa", "Id: T-30050")
        )
    }
}
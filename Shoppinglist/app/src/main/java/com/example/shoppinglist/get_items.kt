package com.example.shoppinglist

class EmailFetcher {
    companion object {
        val item = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val price = "Welcome to Kotlin!"

        fun getItemss(): MutableList<item> {
            var emails : MutableList<Email> = ArrayList()
            for (i in 0..9) {
                val email = Email(senders[i], title, summary)
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            var newEmails : MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title, summary)
                newEmails.add(email)
            }
            return newEmails
        }
    }
}
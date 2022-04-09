package com.example.movieapp.ui.component.movies.data

import com.example.movieapp.R

object DataProvider {

    //popular
    val popularmovie =
        Movie(
            id = 1,
            name = "Coda",
            director = "Sian Heder",
            movieImageId = R.drawable.p_coda
        )
    val popularList = listOf(
        popularmovie,
        Movie(
            id = 2,
            name = "Spider Man",
            director = "Jon Watts",
            movieImageId = R.drawable.p_spider_man
        ),
        Movie(
            id = 3,
            name = "BatMan",
            director = "Matt Reeves",
            movieImageId = R.drawable.p_batman
        ),
        Movie(
            id = 4,
            name = "Don't Look Up",
            director = "Adam McKay",
            movieImageId = R.drawable.p_dont_lookup
        ),
        Movie(
            id = 5,
            name = "Dune",
            director = "Denis Villeneuve",
            movieImageId = R.drawable.p_dune
        ),
        Movie(
            id = 6,
            name = "The Adam Project",
            director = "Shawn Levy",
            movieImageId = R.drawable.p_adam_project
        ),
        Movie(
            id = 7,
            name = "Death on the Nile",
            director = "Kenneth Branagh",
            movieImageId = R.drawable.p_death_onthenile
        ),
        Movie(
            id = 8,
            name = "The Matrix Resurrections",
            director = "Lana Wachowski",
            movieImageId = R.drawable.p_matrix
        ),
        Movie(
            id = 9,
            name = "Morbius",
            director = "Daniel Espinosa",
            movieImageId = R.drawable.p_morbius
        ),
        Movie(
            id = 10,
            name = "The Contractor",
            director = "Tarik Saleh",
            movieImageId = R.drawable.p_the_contractor
        ),
        Movie(
            id = 11,
            name = "Texas Chainsaw Massacre",
            director = "David Blue Garcia",
            movieImageId = R.drawable.p_texas_chainsaw_massacre
        ),
        Movie(
            id = 12,
            name = "Free Guy",
            director = "Shawn Levy",
            movieImageId = R.drawable.p_free_guy
        ),
    )

    //serials
    val serialmovie =
        Movie(
            id = 1,
            name = "Peaky Blinders",
            director = " Steven Knight",
            movieImageId = R.drawable.s_peakyblinders
        )
    val serialList = listOf(
        serialmovie,
        Movie(
            id = 2,
            name = "Moon Knight",
            director = "Doug Moench",
            movieImageId = R.drawable.s_moonknight
        ),
        Movie(
            id = 3,
            name = "Halo",
            director = "Steven Kane, Kyle Killen",
            movieImageId = R.drawable.s_halo
        ),
        Movie(
            id = 4,
            name = "Money Heist",
            director = "Álex Pina",
            movieImageId = R.drawable.s_moneyheist
        ),
        Movie(
            id = 5,
            name = "Squid Game",
            director = "Hwang Dong-hyuk",
            movieImageId = R.drawable.s_squidgame
        ),
        Movie(
            id = 6,
            name = "1883",
            director = "Taylor Sheridan",
            movieImageId = R.drawable.s_1883
        ),
        Movie(
            id = 7,
            name = "Blacklist Cast",
            director = "Christine Moore",
            movieImageId = R.drawable.s_blacklist
        ),
        Movie(
            id = 8,
            name = "Outlander",
            director = "Kate Cheeseman",
            movieImageId = R.drawable.s_outlander
        ),
        Movie(
            id = 9,
            name = "Power Book",
            director = "Robert Munic",
            movieImageId = R.drawable.s_powerbook
        ),
        Movie(
            id = 10,
            name = "Superman & Lois",
            director = "Greg Berlanti & Todd Helbing",
            movieImageId = R.drawable.s_superman
        ),
        Movie(
            id = 11,
            name = "Young Rock",
            director = "Jeff Chiang",
            movieImageId = R.drawable.s_young_rock
        ),
        Movie(
            id = 12,
            name = "Billions Wealth is War",
            director = "Joshua Marston",
            movieImageId = R.drawable.s_billions
        ),
    )

    //comedy&action
    val newmovie =
        Movie(
            id = 1,
            name = "The Lost City",
            director = "Aaron Nee & Adam Nee",
            movieImageId = R.drawable.c_the_lost_city
        )
    val newList = listOf(
        newmovie,
        Movie(
            id = 2,
            name = "The Bubble",
            director = "Judd Apatow",
            movieImageId = R.drawable.c_the_bubble
        ),
        Movie(
            id = 3,
            name = "Red Notice",
            director = "Rawson Marshall Thurber",
            movieImageId = R.drawable.c_red_notice
        ),
        Movie(
            id = 4,
            name = "Licorice Pizzai",
            director = "Paul Thomas Anderson",
            movieImageId = R.drawable.c_licorice_pizza
        ),
        Movie(
            id = 5,
            name = "Dog",
            director = "Channing Tatum & Reid Carolin",
            movieImageId = R.drawable.c_dog
        ),
        Movie(
            id = 6,
            name = "The Unbearable Weight of Massive Talent",
            director = "Tom Gormican",
            movieImageId = R.drawable.c_the_unbearable_weight
        ),
        Movie(
            id = 7,
            name = "Home Sweet Home Alone",
            director = "Dan Mazer",
            movieImageId = R.drawable.c_home_alone
        ),
        Movie(
            id = 8,
            name = "Sonic the Hedgehog2",
            director = "Jeff Fowler",
            movieImageId = R.drawable.c_sonic_the_hedgehog
        ),
        Movie(
            id = 9,
            name = "Atlanta Film Festival",
            director = "Isabel Castro",
            movieImageId = R.drawable.c_atlanta
        ),
        Movie(
            id = 10,
            name = "Jackass Forever",
            director = "Jeff Tremaine",
            movieImageId = R.drawable.c_jackass_for_ever
        ),
        Movie(
            id = 11,
            name = "Army of Thieves",
            director = "Matthias Schweighöfer",
            movieImageId = R.drawable.c_army_of_thieves
        ),
        Movie(
            id = 12,
            name = "6 Underground",
            director = "Michael Bay",
            movieImageId = R.drawable.c_6under_ground
        ),
    )
}

# zadatakZaSamostalniRad.predavanje.13.1.15
Balansiranje zagrada (zadatak za vježbanje stackova)
Evo i formalizacija zadatka koji sam dao tokom predavanja u ponedjeljak.

Napraviti program koji nudi korisniku da unese izraz koji može sadržavati zagrade. Zatim ispitati unijeti izraz i provjeriti da li su unutar njega zagrade dobro balansirane.

"Dobro balansirane" zagrade definišemo na sljedeći način: svaka zagrada je zatvorena nakon što je adekvatna zagrada zatvorena. Svaka otvorena zagrada je zatvorena tek nakon što su sve zagrade unutar nje zatvorene. Primjer je jasniji od objašnjenja:

Primjeri dobro balansiranih zagrada:
* ( 3 + 5 ) * 15
* array[(3 + 5) * 15]
* [ { ( ) } ( ) ]

Primjeri loše balansiranih zagrada:
* (
* [ ) ( ]
* [ ( ] )

Dakle, izraz koji korisnik unese može sadržavati brojeve, tekst i zagrade. Prilikom provjere balansiranosti zagrada, možete ignorisati sve ostale karaktere. Ako je izraz dobro balansiran, ispisati potvrdu, a ako nije ispisati i to.

Bonus*: Dozvoliti da se unutar zagrada nađu i "stringovi", tj. tekst pod navodnicima. Sve znakove koji su dio stringa treba ignorisati, **uključujući zagrade**. Naprimjer, i ovo bi bio ispravno balansiran izraz:

* print(" [ zagrade u stringu } ")

Savjeti:
* Dodajte `peek` metodu u implementaciju stacka. Ova metoda vraća element sa vrha stacka, bez da ga ukloni

Opis algoritma koji treba implementirati:

1)Otvorene zagrade stavljamo na stack.
2) Kada dođemo do zatvorene zagrade pop-amo zagradu sa stacka i vidimo da li si odgovarju. U slučaju da ne odgovaraju, dobivamo negativan rezultat i možemo prekinuti algoritam. Ako je na kraju čitanja izraza stack prazan, znači da imamo dobro balansirane zagrade.


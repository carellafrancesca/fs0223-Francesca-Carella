    /* ESERCIZIO 1
       Scrivi una funzione per cambiare il titolo della pagina in qualcos'altro
    */


       const changeTitle = document.getElementsByTagName("h1")[0];
        changeTitle.textContent = "Sito Epicode";

       console.log(changeTitle);

   
       /* ESERCIZIO 2
          Scrivi una funzione per aggiungere al titolo della pagina una classe "myHeading"
       */
   

       const addClassToTitle = document.getElementsByTagName("h1");
       addClassToTitle.class = "myHeading";
        
       console.log(addClassToTitle);


       /* ESERCIZIO 3
          Scrivi una funzione per che cambi il testo dei p figli di un div
         */
   

       const changePcontent = function () {
        let contenuto = document.querySelectorAll("div p");
        for(p of contenuto){p.textContent = "testo sostituito"};
        }
        
        changePcontent();

   
       /* ESERCIZIO 4
          Scrivi una funzione che cambi la proprietà href di ogni link (tranne quello nel footer) con il valore https://www.google.com
         */
   

       const changeUrls = function (){
        let link = document.querySelectorAll("a:not(footer a)");
        for(a of link){a.textContent = "https://www.google.com/"};
       }

       changeUrls();
        

       /* ESERCIZIO 5
          Scrivi una funzione che aggiunga un nuovo elemento lista alla seconda lista non ordinata
       */
   

        const addToTheSecond = function () {
         let lista = document.createElement('li');
         lista.textContent = "4th";
         document.querySelector("#secondList").appendChild(lista);
         }
    
        addToTheSecond();

   
       /* ESERCIZIO 6
          Scrivi una funzione che aggiunga un secondo paragrafo al primo div
       */
   
        
       const addParagraph = function () {
        let paragrafo = document.createElement("p");
        paragrafo.textContent = "testo aggiunto";
        document.querySelector("p").appendChild(paragrafo);
       }
       
       addParagraph();


       /* ESERCIZIO 7
          Scrivi una funzione che faccia scomparire la prima lista non ordinata
       */
   

        const hideFirstUl = function () {
         let destroyList = document.querySelector('#firstList');
         destroyList.style.display = 'none';
        }
      
        hideFirstUl();

   
       /* ESERCIZIO 8 
          Scrivi una funzione che renda verde il background di ogni lista non ordinata
         */

   
       /* ESERCIZIO 9
          Scrivi una funzione che rimuova l'ultima lettera dall'h1 ogni volta che l'utente lo clicca
         */
   

       const makeItClickable = function () {
        let h1 = document.querySelector('h1');

        let testoArr = h1.innerText.split('');
        testoArr.pop();
        
        let nuovoTesto = testoArr.join('');
        h1.textContent = nuovoTesto;          
       }

       document.querySelector('h1')
       .addEventListener('click', makeItClickable);
  
   
       /* ESERCIZIO 10
          Crea una funzione che, al click sul footer, riveli l'URL del link interno come contenuto di un alert()
         */
   

       const revealFooterLink = function () {
        let url = footer.querySelector('a').href;
        alert(url);
       }

       document.querySelector('footer')
       .addEventListener('click', revealFooterLink);

   
       /* ESERCIZIO 11
          Crea una funzione che crei una tabella nell'elemento con id "tableArea". 
          La tabella avrà 5 elementi e questa struttura: immagine, nome prodotto, quantità, prezzo
       */
   
       const generateTable = function () {

        
       }

       /* ESERCIZIO 12
          Crea una funzione che aggiunga una riga alla tabella precedentemente creata e fornisca i dati necessari come parametri
       */
   
       const addRow = function () {
   
   
       }
   
       /* ESERCIZIO 14
         Crea una funzione che nasconda le immagini della tabella quando eseguita
       */
   
       const hideAllImages = function () {
   
   
       }
   
       /* EXTRA ESERCIZIO 15
         Crea una funzione che cambi il colore del h2 con id "changeMyColor" con un colore random ad ogni click ricevuto
       */
   
       const changeColorWithRandom = function () {
   
   
       }
   
       /* EXTRA ESERCIZIO 16
         Crea una funzione che elimini le vocali da ogni elemento testuale della pagina (puoi aiutarti con i nuovi metodi degli array di ES6)
       */
   
       const deleteVowels = function () {
   
   
       }
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Replici extends Actor
{
    
    public static String[] replici =
    {
        //Prima intalnire
      "Strainul: Scuze ca am tras cu urechea, dar ai nevoie de o slujba?",   
      "Lucio: Da, stiti un loc unde m-as putea angaja?",
      "Strainul: E ziua ta norocoasa! Chiar cautam pe cineva care sa ma ajute",
      "sa recuperez ceva ce mi-a fost furat acum mult timp.",
      "Strainul: Ne intalnim la intrarea in Padurea lui Zaratras.",
      //Intrarea in padure
      "Lucio: Hei cum... cum ai ajuns asa de repede?",
      "Strainul: Stiu cateva scurtaturi.",
      "Strainul: Cunosc aceasta padure dintotdeauna.",
      "Strainul: Inca de cand ne-am intalnit nu am putut sa nu observ",
      "acea ramura de copac pe care o porti cu tine.",
      "Strainul: Priveste in jurul tau. Padurea a simtit-o fiindca provine din acest loc",
      "Lucio: Nu inteleg... Ce este asa special la aceasta ramura?",
      "Strainul: Priveste inscriptiile de pe ea.",
      "Este o bagheta magica ce a apartinut candva unui clan foarte puternic de vrajitori.",
      "Lucio: Ma poti invata sa o folosesc?",
      "Strainul: Inainte de toate, ar trebui sa stii ca detine o putere extraordinar de mare.",
      "Trebuie manuita cu mare atentie!",   
      //Dupa training
      "Strainul: A fost un antrenament greu, dar te-ai descurcat bine.",
      "Strainul: Cum ti s-a parut?",
      "Lucio: Nu a fost atat de greu pe cat ma asteptam.",
      "Strainul: Ceea ce cautam se afla in inima padurii, dincolo de Pestera Bahaos.",
      "Strainul: Sper ca ce ai invatat azi sa te ajute pe parcursul calatoriei.",
      "Lucio: Indiferent ce voi intalni promit sa recuperez ceea ce ai pierdut.",
      //Training
      "Strainul: Primul pas in folosirea baghetei este rostirea cuvintelor magice.",
      "Avada.. Kedevra..",
      "In timp ce rostesti cuvintele magice, vizualizeaza in minte ceea ce vrei sa faci.",
      "In fata ta poti vedea, printre copaci, o ciuperca uriasa cu care te poti antrena.",
      "Canalizeaza-ti energia si incearca sa nimeresti acea ciuperca.",
      "Deci.. Care erau cuvintele magice?",
      //Dupa Training
      "Nu astea erau cuvintele, incearca din nou.",
      "Trebuie sa mai lucrezi la tinta.",
      "Bravo! Putini au reusit pana acum sa invete atat de repede o abilitate asa de puternica!",
      
      // La sfarsit
      "Strainul: Deci, Lucio ai ajuns pana aici, sunt sigur ca ai o multime de intrebari",
      "Lucio: Am ajuns in interiorul padurii si nu inteleg ce ar fi trebuit sa recuperez",
      "si de ce nu ai facut-o singur din moment ce esti deja aici",
      "Strainul: Cand am spus ca mi-a fost furat ceva drag acum 18 ani...",
      "Strainul: Priveste mormintele astea, acestia au fost prietenii mei dragi",
      "unul dintre cele mai puternice clanuri de vrajitori care au calcat pe Pamant",
      "se aflau sub protectia mea pana King i-a furat de langa mine",
      "si mi-a furat dreptul de conducator",
      "Lucio: Deci asta inseamna ca tu esti de fapt Zaratras?",
      "Zaratras: Imi pare rau ca a trebuit sa ascund asta de tine pana acum",
      "dar a fost dorinta parintilor tai sa te invat tainele magice si sa razbuni intreg clanul",
      "Lucio: Mi-as fi dorit sa fiu aici cand aveau nevoie de mine...",
      "Zaratras: Le poti pastra amintirea in viata devenind noul ocrotitor al padurii.",
      "Zaratras: A fost dintotdeaua destinul tau, Lucio..."     
    };  
    public static String[] repliciNarator =
    {
      "Povestea noastra incepe cu Lucio, un baiat al carui trecut este invaluit in mister. Lucio a",          
      "fost adus la orfelinatul Luna Plina acum 18 veri de catre un calator intre cele doua lumi,",
      "un vrajitor foarte puternic ce refuza sa accepte faptul ca timpul sau s-a terminat pe Pamant.",
      "Acest necunoscut cunoaste povestea lui Lucio si va incerca sa il ajute sa afle cine este de fapt.",
      "Oare va accepta eroul nostru marturisirile strainului? Va incerca sa afle adevarul despre familia",
      "sa? Va reusi sa treca peste obstacolele ce vor aparea in timpul calatoriei sale?",
      "Apasa CONTINUA pentru a incepe."
      
    };
    public static String[] repliciCasa =
    {
        "Director: Lucio, dupa cum bine stii, politica orfelinatului nostru",          
        "nu ne mai permite sa te ingrijim si dupa varsta de 18 ani.",
        "Lucio: Si eu ce voi face?",
        "Director: Poti pentru inceput sa iti cauti un loc de munca.",
        "Uite aici 50 de galbeni care sa te ajute pentru un timp.",
        "Lucio: Va multumesc pentru tot, nu am sa uit tot ce ati facut pentru mine",
        "Director: Ai grija de tine, tinere. Iti vom simti lipsa.",
        "Director: Era cat pe ce sa uit. In seara in care ai fost adus in pragul",
        "nostru, aveai cu tine un fel de creanga cu niste inscriptii ciudate.",
        "Lucio: Atatea lucruri pe care le puteau lasa parintii mei ca amintire..",
        "si tot ce imi aminteste de ei este o creanga ciudata de copac.."
        
    };
    public static String[] variantaVraji =
    {
        "Expecto Patronum",
        "Avada Kedevra",
        "Petrificus Totalis",
        "Rictusempra",
        "Sator Arepo"
    };
    
    public static String[] vanzatorAlimentara = 
    {
        "Lucio: Dupa ziua asta, macar sa ma consolez cu o prajitura...",
        "Vanzatorul:...",
        "Vanzatorul: Doresti ceva?",
        "Lucio: Da! Prajitura asta din fata arata delicios!",
        "Vanzatorul: Sigur, doar 75 de galbeni.",
        "Lucio: Eu am doar 50 de galbeni. Nu-mi puteti face o mica reducere?",
        "Astazi este ziua mea..",
        "Vanzatorul: Din pacate nu pot!",
        "Lucio: Angajati personal?",
        "Vanzatorul: Imi pare rau, nu am niciun post liber."        
    };
    
    public static String[] dialogInamici =
    {
      //Little Guardian
      "Lucio: Strainul mi-a spus sa am grija la pericole...",
      "dar nu ma asteptam sa intalnesc o pruna cu picioare",
      "King: Micutule, vorbesti cu King, cea mai puternica fiinta din toata padurea!",
      "Lucio: Adica o sa ma omori cu dragalasenie?",
      "King: Sa vedem daca vei fi la fel de increzator dupa ce te voi atinge",
      "Corpul asta secreta cele mai periculoase toxine cunoscute de om",
      "Sper ca esti rapid",
      //Big Guardian
      "King: Ne intalnim din nou micutule vrajitor",
      "Lucio: Semnul acela cu Soare... esti cumva fratele lui King?",
      "King: Eu sunt King netotule, forma aceea pe care ai vazut-o o folosesc uneori",
      "ca sa imi dau seama de nivelul puterii celor care intra in Padurea lui King",
      "Lucio: Parca asta era Padurea lui Zaratras... ",
      "King: Batranul ala nu mai are puterea pe care o avea candva",
      "si nu mai poate conduce fiintele care traiesc in aceasta padure",
      "este timpul ca un nou rege sa se ridice si sa revendice tronul",
      "King: Oricare ar fi motivele tale, daca nu ma vei lasa sa trec",
      "pregateste-te sa fii invins din nou",
      "King: Acum micutule vrajitor,vei vedea cum arata puterea adevarata!"
    };
}

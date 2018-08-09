package com.example.fitzzz.timesup.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordsController {

    private List<String> words =  new ArrayList<>(Arrays.asList(
            "Architecte", "Traducteur", "Archéologue", "Bûcheron", "Boulanger", "Ébéniste",
            "Scientifique", "Policier", "Réparateur automobile", "Styliste", "Pédiatre", "Géologue",
            "Toiletteur", "Professeur", "Plombier", "Coiffeur", "Médecin", "Maréchal ferrant",
            "Berger", "Infirmière", "Agriculteur", "Peintre", "Caissière", "Grutier", "Avocat",
            "Acteur", "Footballeur", "Reporter", "Président", "Éleveur de chiens", "Informaticien",
            "Cuisinier", "Détective", "Publiciste", "Fleuriste", "Océanologue", "Dentiste",
            "Nageur", "Serrurier", "Pharmacien", "Garde forestier", "Maître-nageur", "Généticien",
            "Livreur de pizza", "Comptable", "Moniteur de ski", "Psychiatre", "Journaliste",
            "Vétérinaire", "Boucher", "Serveur ,Webmaster", "Orthophoniste", "Libraire",
            "Réalisateur", "Sapeur-pompier", "Chanteur", "Marionnettiste", "Designer",
            "Danseuse de ballet", "Magicien", "Photographe", "Pêcheur", "Barman", "Dompteur",
            "Éboueur", "Chanteur d'opéra", "Chirurgien", "Président de la république",
            "Pilote d'avion", "Clown", "Pick Pocket", "Danseuse du ventre", "Professeur de sport",
            "Garagiste",

            "Pingouin", "Héron", "Girafe", "Panda", "Babouin", "Marmotte", "Dauphin", "Bernard l’ermite",
            "Boa", "Chameau", "Autruche", "Papillon", "Écureuil", "Lion", "Hibou", "Scarabée", "Lama",
            "Zèbre", "Koala", "Fourmi", "Souris", "Taupe", "Raton-laveur", "Grenouille", "Biche",
            "Escargot", "Phoque", "Tortue", "Chien de traineau", "Étoile de mer", "Caméléon", "Loutre",
            "Paon", "Kangourou", "Mouton", "Canard", "Bison", "Dinosaure", "Tatou", "Poule", "Hyène",
            "Faucon", "Anaconda", "Scorpion", "Coccinelle", "Têtard", "Saumon", "Mille-pattes",
            "Hippocampe", "Libellule", "Tapir", "Poisson clown", "Raton laveur", "Pic vert", "Chauve-souris",
            "Poulpe", "Lapin", "Dindon", "Paresseux", "Éléphant", "Moustique", "Crabe", "Papillon",
            "Chauve souris", "Piranha", "Poisson-chat", "Limace", "Pieuvre", "Pigeon", "Araignée",
            "Chat", "Tigre", "Singe",

            "Regarder la télé", "Mâcher un chewing-gum", "Faire du surf", "Fêter son anniversaire",
            "Rencontrer un martien", "Faire sauter une crêpe", "Presser une orange", "Faire la vaisselle",
            "Courir un Marathon", "Faire de la corde à sauter", "Couper un gâteau", "Marcher avec des échasses",
            "Faire ses devoirs", "Étendre du linge", "Sauter à la corde", "Tuer une araignée avec une bombe insecticide",
            "Être lunatique", "Faire la racaille", "Jouer à Pokemon", "Faire le clown", "Tirer à l’arc",
            "Aller dans le train fantôme", "Chercher ses clés", "Courir après le bus", "Sortir les poubelles",
            "Faire des claquettes", "Allumer le barbecue", "Regarder la télé", "Mâcher un chewing-gum",
            "Traire une vache", "Escalader une montagne", "Se battre à l’épée", "Avoir la grippe", "Téléphoner à mamie",
            "Planter un arbre", "Éplucher des patates", "Aller à la piscine", "Promener le chien",
            "Jongler avec des pommes", "Prendre l’ascenseur", "Se transformer en loup-garou", "Lire du braille",
            "Faire du patin à glace", "Être malade en bateau", "Explorer une grotte", "Jouer du banjo", "Faire un tour en montgolfière",
            "Nouer sa cravate", "Se faire cuire un œuf", "Prendre l’escalator", "Faire sauter une crêpe",
            "Presser une orange", "Jouer avec un yoyo", "Recevoir une médaille", "Être blonde", "Emballer une momie",
            "Arriver en retard", "Se préparer un café", "Changer le bébé", "Prendre un bain", "Aller à la pêche",
            "Faire de la trotinette", "Prendre un médicament (de votre choix…)", "Faire une course de haies",
            "Prendre le train", "Allumer un feu", "Vendre un tapis", "Manger une glace", "Faire de la moto", "Faire un câlin",
            "Marcher sur des braise", "Faire une galipette", "Manger des spaghettis", "Marcher dans le désert", "Faire des crêpes",
            "Danser la valse", "Changer une couche", "Faire de la boxe", "Jouer au curling", "Astérix le gaulois",
            "Bill Gates", "Lancelot", "Nanouk l’esquimau", "Superman", "Barack Obama", "Tintin", "Rayman",
            "Einstein", "Alice au pays des merveilles", "Jack Sparrow", "Louis Vuitton", "Alphonse Daudet",
            "Casimir", "Napoléon", "Bugs Bunny", "Johnny Halliday", "Lucky Luke", "Charlie Chaplin", "La Joconde",
            "Dark Vador", "Le génie de la lampe", "Haroun Tazieff", "Schreck", "La reine d’Angleterre",
            "Claude François", "Gaston Lagaffe", "Cindy Sanders", "Zavatta", "Lionel Messi",
            "Agatha Christie", "Hubert Reeves", "Picasso", "Steve Job", "Louis de Funès", "Mickey",
            "Chantal Goya", "Cousteau", "Galilée", "Un shadock", "Chef indien", "Harry Potter", "Cyril Lignac",
            "Archimède", "L’Abbé Pierre", "Louis XIV", "Céline Dion", "Les frères Grimm", "Cléopâtre", "Mr Bean",
            "Yannick Noah", "Isaac Newton", "Le Dalaï lama", "Bisounours", "Homer Simpson", "Jean-Pierre Pernaut",
            "Jules Verne", "Gad Elmaleh", "Dorothée", "Mac Gyver", "Mimi Mathy", "Zinedine Zidane", "Michael Jackson",
            "Mime Marceau", "Marilyn Monroe",

            "Anguille sous roche", "Tomber dans les pommes", "Mettre son grain de sel", "Être un ours mal léché",
            "Un froid de canard", "Jeter le bébé avec l’eau du bain", "Faut pas pousser mémé dans les orties",
            "Poser un lapin", "Filer à l’anglaise", "Fier comme un pou", "Avoir une araignée au plafond",
            "Rouler des yeux de merlan frit", "La poule aux oeufs d’or", "Bailler aux corneilles",
            "Pousser comme un champignon", "Toucher du bois", "Tirer les vers du nez", "Revenir bredouille",
            "Raconter des salades", "Vouloir le beurre et l’argent du beurre", "Être au bout du rouleau",
            "Devoir une fière chandelle", "Avoir un poil dans la main", "Comme on fait son lit", "on se couche",
            "Être au pied du mur", "Dire ses 4 vérités", "Être sage comme une image", "Passer comme un lettre à la poste",
            "Péter plus haut que son cul", "Rouler à tombeau ouvert", "La goutte d’eau qui fait déborder le vase",
            "Ronfler comme un loir", "Avoir les yeux plus gros que le ventre", "S’ennuyer comme un rat mort",
            "Copains comme cochons", "Donner sa langue au chat", "Remettre les pendules à l’heure",
            "L’habit ne fait pas le moine", "Mettre la main à la pâte", "Se mettre en 4", "Tête de linotte",
            "Épée de Damoclès", "Avoir le cafard", "Tirer le diable par la queue", "Avoir l’estomac dans les talons",
            "Donner de la confiture à un cochon", "Courir sur le haricot", "Tuer le temps", "Avoir la moutarde qui monte au nez",
            "Être sourd comme un pot", "Pleurer comme une madeleine", "Rire jaune", "N’avoir pas froid aux yeux",
            "La bave du crapaud n’atteint pas la blanche colombe", "Mentir comme un arracheur de dents",
            "Un moulin à paroles", "Être muet comme une carpe", "Avoir les crocs", "Se faire un sang d’encre",
            "Avoir plusieurs cordes à son arc", "Remuer le couteau dans la plaie", "Se prendre un râteau",
            "Pisser dans un violon", "Planche à voile", "Rugby", "Boxe anglaise", "Tennis de table",
            "Lancer de disque", "Parachutisme", "Gymnastique", "Plongée sous marine", "Curling", "Badminton",
            "Aviron", "Triathlon", "Spéléologie", "Foot", "Basket", "Natation", "Taikwendo", "Volley Ball",
            "Lancer du marteau", "Saut en longueur", "saut en hauteur", "110 mètres haies"));

    private List<Integer> pickIndice() {
        List<Integer> pickedIndice = new ArrayList<>();

        Random rand = new Random();
        int randomIndice;
        while (pickedIndice.size() < 30) {
            randomIndice = rand.nextInt(this.words.size());

            if (!pickedIndice.contains(randomIndice)) {
                pickedIndice.add(randomIndice);
            }
        }
        return pickedIndice;
    }

    public List<String> pickWord() {
        List<Integer> pickedIndice = this.pickIndice();

        ArrayList<String> pickedWord = new ArrayList<>();
        for (Integer i : pickedIndice) {
            pickedWord.add(words.get(i));
        }
        return pickedWord;
    }


}

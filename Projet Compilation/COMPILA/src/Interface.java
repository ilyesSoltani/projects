
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Interface extends javax.swing.JFrame {
    static ArrayList<String> words = new ArrayList<String>();
    static ArrayList<String> line = new ArrayList<String>();
    static ArrayList<String> lexicale = new ArrayList<String>();
    static String[] word;
    static JFileChooser fileChooser = new JFileChooser("C:\\Users\\hp-pc\\Documents\\NetBeansProjects\\COMPILA");
    
    static FileNameExtensionFilter fich = new FileNameExtensionFilter("Fichier texte","COMPILA");
    
    public Interface() {
        initComponents();
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        semantiqueButton.setCursor(cursor);
        lexicaleButton.setCursor(cursor);
        chargerButton.setCursor(cursor);
        syntaxiqueButton.setCursor(cursor);
        jTextArea.setEditable(false);
        chargerButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    jTextArea.setText("");
                    load();
                    int i = 0;
                    while (i < line.size())
                    {
                        jTextArea.setText(jTextArea.getText()+line.get(i)+"\n");
                        i++;
                    }	
		} catch (FileNotFoundException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        chargerButton = new javax.swing.JButton();
        lexicaleButton = new javax.swing.JButton();
        syntaxiqueButton = new javax.swing.JButton();
        semantiqueButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analyseur lexicale, syntaxique et sémantique");
        setSize(new java.awt.Dimension(900, 500));

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTextArea.setRows(5);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sortie :");

        chargerButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        chargerButton.setText("Charger un fichier");

        lexicaleButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lexicaleButton.setText("Analyse Lexicale");
        lexicaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lexicaleButtonActionPerformed(evt);
            }
        });

        syntaxiqueButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        syntaxiqueButton.setText("Analyse Syntaxique");
        syntaxiqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syntaxiqueButtonActionPerformed(evt);
            }
        });

        semantiqueButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        semantiqueButton.setText("Analyse Sémantique");
        semantiqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semantiqueButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Commande :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(semantiqueButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chargerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lexicaleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(syntaxiqueButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextArea)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chargerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lexicaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(syntaxiqueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semantiqueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextArea))
                .addGap(15, 15, 15))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lexicaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lexicaleButtonActionPerformed
        jTextArea.setText("");
        analyseLexicale(words);
        int i=0;
        while (i < words.size())
        {
            jTextArea.setText(jTextArea.getText()+words.get(i) + "  :  " + lexicale.get(i)+"\n");
            try 
				{
					
					FileWriter f =new FileWriter("analyseLexicale.java");
					BufferedWriter a = new BufferedWriter(f);
					
					a.write(jTextArea.getText()+"\n"); 
				a.close();	
				}catch (IOException er) {;}
            
            
            i++;
        }
    }//GEN-LAST:event_lexicaleButtonActionPerformed

    private void semantiqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semantiqueButtonActionPerformed
        
        jTextArea.setText("");
			
			int i = 0;
			while (i < line.size()) {
				jTextArea.setText(jTextArea.getText() +""+ analyseSemantique(line.get(i))+" \n" );
				try 
				{
					
					FileWriter f =new FileWriter("analyseSemantique.java");
					BufferedWriter a = new BufferedWriter(f);
					
					a.write(jTextArea.getText()+"\n"); 
				a.close();	
				}catch (IOException er) {;}
				
				
				i++;
				
			}
        
    }//GEN-LAST:event_semantiqueButtonActionPerformed

    private void syntaxiqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syntaxiqueButtonActionPerformed
        jTextArea.setText("");
        int i = 0;
        while (i < line.size())
        {
            jTextArea.setText(jTextArea.getText()+line.get(i) + "           <---------  " +analyseSyntaxique(line.get(i))+"\n" );
            try 
				{
					
					FileWriter f =new FileWriter("analyseSyntaxique.java");
					BufferedWriter a = new BufferedWriter(f);
					
					a.write(jTextArea.getText()+"\n"); 
				a.close();	
				}catch (IOException er) {;}
            
            
            i++;
        }
        
    }//GEN-LAST:event_syntaxiqueButtonActionPerformed

    /**
     * @param chaineCaractere
     * @param i
     * @param args the command line arguments
     * @return 
     */
    
    public boolean numberVerification(String chaineCaractere, int i)
    {
        char[] N = {'0','1','2','3','4','5','6','7','8','9'};
	for(int cpt1 = 0 ; cpt1 < N.length ; cpt1++)
        {
            if (chaineCaractere.charAt(i) == N[cpt1])
                return true;
        }
        return false;
    }
      
    public boolean caractereVerification(String chaineCaractere, int i)
    {
        char[] alphabet = {':','\"',',','%','a','b','c','d','e','f','g','h','i',
                            'j','k','l','m','n','o','p','q','r','s','t','u','v',
                            'w','x','y','z','A','B','C','D','E','F','G','H','I',
                            'J','K','L','M','N','O','P','Q','R','S','T','U','V',
                            'W', 'X','Y','Z',';'};
	for(int cpt2 = 0 ; cpt2 < alphabet.length ; cpt2++)
        {
            if(chaineCaractere.charAt(i) == alphabet[cpt2])
                return true;
        }
        return false;
    }
    
    public String number(String chaineCaractere)
    {
	int cpt3 = 0;
        boolean point = true;
	
        for(int i = 0 ; i < chaineCaractere.length() ; i++)
        {
            if (numberVerification(chaineCaractere, i))
                cpt3++;
            else
                if(point & chaineCaractere.charAt(cpt3)=='.')
                {
                    cpt3++;
                    point = false;
                }
	}
        if (cpt3 == chaineCaractere.length() && !chaineCaractere.contains(","))
            return "Integer Number";
	else
            if (cpt3 == chaineCaractere.length() && !point)
                return "Real Number";
	return null;
}
    
    public String ident(String chaineCaractere)
    {
	int cpt4 = 0;
        boolean dash = true;
        boolean first = false;
	
	if(caractereVerification(chaineCaractere, 0))
        {first = true;      cpt4++;}
        
	if(first == true && chaineCaractere.length() == 1)
            return "Identifier";
	else
            if (chaineCaractere.length() > 1)
            {
		for(int i = 1 ; i < chaineCaractere.length() ; i++)
                {
                    if (caractereVerification(chaineCaractere, i))
                    {dash=true;     cpt4++;}
                    else if (numberVerification(chaineCaractere, i))
                    {dash=true;     cpt4++;}
                    else if (chaineCaractere.charAt(i) == '_' && dash)
                    {dash=false;    cpt4++;}
		}
		if (cpt4 == chaineCaractere.length())
                    return "Identifier";
            }
        return null;
    }
    
    public String inputs(String chaineCaractere)
    {
        String[] give = {"Start_Program",
            "Int_Number",
            ":",
            "i",
            ",",
            "j",
            ",",
            "Aft_5",
            ";;",
            "Give",
            "i",
            ":",
            "23",
            ";;",
            "Real_Number",
            ":",
            "Aft34_2",
            ";;",
            "If",
            "-",
            "i",
            "<",
            "j",
            "-",
            "Give",
            "Aft_5",
            ":",
            "10",
            ";;",
            "Else",
            "Start",
            "Affect",
            "i",
            "to",
            "j",
            ";;",
            "Give",
            "Aft34_2",
            ":",
            "123.54",
            ";;",
            "Finish",
            "ShowMes",
            ":",
            "\"",
            "ceci est un message",
            "\"",
            ";;",
            "ShowVal",
            ":",
            "i",
            ";;",
            "//.",
            "ceci est un commentaire",
            "End_Program"};

	String[] affiche = {"Mot réservé pour un début d'un programme",
                        "Mot reservé pour une déclaration d'un entier",
                        "Caractère réservé",
                        "Identificateur",
                        "Caractère réservé virgule",
                        "Identificateur",
                        "Caractère réservé virgule",
                        "Identificateur",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour une affectation d'une valeur",
                        "Identificateur",
                        "Caractère réservé",
                        "Valeur entière",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour déclaration d'un reel",
                        "Caractère réservé",
                        "Identificateur",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour une condition",
                        "Caractère réservé tiret",
                        "Identificateur",
                        "Symbole inférieur",
                        "Identificateur",
                        "Caractère réservé tiret",
                        "Mot réservé pour une affectation d'une valeur",
                        "Identificateur",
                        "Caractère réservé",
                        "Une valeur entière",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour ine condition SINON",
                        "Mot réservé pour début d'un bloc",
                        "Mot réservé pour affectation de valeur entre variables",
                        "Identificateur",
                        "Mot réservé affectation à",
                        "Identificateur",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour une affectation d'une valeur",
                        "Identificateur",
                        "Caractère réservé",
                        "Valeur réele",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour fin d'un bloc",
                        "Mot réservé pour l'affichage d'un message",
                        "Caractère réservé",
                        "Caractère réservé pour l'affichage d'un message",
                        "Un message",
                        "Caractère réservé pour l'affichage d'un message",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour l'affichage d'une valeur",
                        "Caractère réservé",
                        "Identificateur",
                        "Mot réservé fin d'instruction",
                        "Mot réservé pour un commentaire",
                        "Un commentaire",
                        "Mot réservé fin du programme"};
				 
	for(int i = 0 ; i < give.length ; i++)
        {
            if(chaineCaractere.equals(give[i]))
            {
                return affiche[i];
            }
	}
	return null;
    }

    public void analyseLexicale(List<String> liste)
    {
        for(int i = 0 ; i < words.size() ; i++)
        {
            if(inputs(words.get(i)) != null)
                lexicale.add(inputs(words.get(i)));
            else
                if(ident(words.get(i)) != null)
                    lexicale.add(ident(words.get(i)));
                else
                    if(number(words.get(i)) != null)
                        lexicale.add(number(words.get(i)));
                    else lexicale.add("Erreur lexicale !");
        }
    }
    
    public String analyseSyntaxique(String chaineCaractere)
    {
        if(chaineCaractere.equals("End_Program"))
            return "Fin du programme";
	else if(chaineCaractere.equals("Start_Program"))
            return "Début du programme"; 
                else if(chaineCaractere.equals("Else"))
                	return "Sinon";
                else if(chaineCaractere.equals("Start"))
                    return "Début d'un bloc";
                else if(chaineCaractere.equals("Finish"))
                    return "Fin d'un bloc";
                else if(chaineCaractere.startsWith("//."))
                    return "Un commentaire";
                else if(chaineCaractere.startsWith("ShowMes : \"") && chaineCaractere.endsWith("\" ;;"))
                    return "Affichage d'un message";
        
                else if(chaineCaractere.contains(" "))
    	{
    	word = chaineCaractere.split(" ") ;
    	int i=0;
    	int j=1;
        switch (word[i])
        {
            case "Int_Number":
                {
                    i++;
                    String aux =" ";
                    if(word[i].equals(":"))
                    {
                        i++;
                        if(ident(word[i]) != null)
                        {
                            aux += word[i]+" , ";
                            i++;
                            while(word[i].equals(","))
                            {
                                i++;
                                j++;
                                if(ident(word[i]) != null)
                                {
                                    aux += word[i]+" , ";
                                    i++;
                                    if(word[i].equals(";;"))
                                        return "Déclaration de " +aux+ " variables entières";
                                }
                            }
                        }
                    }
                    break;
                }
                case "Real_Number":
                {
                    i++;
                    String aux =" ";
                    if(word[i].equals(":"))
                    {
                        i++;
                        if(ident(word[i]) != null)
                        {
                            aux += word[i]+" , ";
                            i++;
                            while(word[i].equals(","))
                            {
                                i++;
                                j++;
                                if(ident(word[i]) != null)
                                {
                                    aux += word[i]+" , ";
                                    i++;
                                    if(word[i].equals(";;"))
                                        return "Déclaration de " +aux+ " variables réeles";
                                }
                            }
                        }
                    }
                    break;
                }
                case "Affect":
                    {
                        String aux =" ";
                        String aux2 =" ";
                        i++;
                        if(ident(word[i]) != null)
                        {
                            aux += word[i]+" ";
                            i++;
                            if(word[i].equals("to"))
                            {
                                i++;
                                if(ident(word[i]) !=null)
                                {
                                    aux2 += word[i]+" ";
                                    i++;
                                    if(word[i].equals(";;"))
                                        return "Affectation de la valeur de "+aux2+" dans la variable "+aux;
                                }
                            }
                        }
                        break;
                    }
                case "If":
                    i++;
                    if(word[i].equals("-"))
                    {
                        i++;
                        if(ident(word[i]) != null)
                        {
                            i++;
                            if(word[i].equals("==") || word[i].equals(">") || word[i].equals("<"))
                            {
                                i++;
                                if(ident(word[i]) != null)
                                {
                                    i++;
                                    if(word[i].equals("-"))
                                    {
                                        i++;
                                        if(word[i].equals("Give"))
                                        {
                                            String aux =" ";
                                            String aux2 =" ";
                                            i++;
                                            if(ident(word[i]) != null)
                                            {
                                                aux += word[i]+" , ";
                                                i++;
                                                if(word[i].equals(":"))
                                                {
                                                    aux += word[i]+" , ";
                                                    i++;
                                                    if(number(word[i]) == "Integer Number" ||number(word[i]) == "Real Number" )
                                                    {
                                                        aux2 += word[i]+" , ";
                                                        i++;
                                                        if(word[i].equals(";;"))
                                                            return "Condition alors action";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "Give":
                    {
                        String aux =" ";
                        String aux2 =" ";
                        i++;
                        if(ident(word[i]) != null)
                        {
                            aux += word[i]+" , ";
                            i++;
                            if(word[i].equals(":"))
                            {
                                i++;
                                if(number(word[i]) == "Integer Number")
                                {
                                    aux2 += word[i]+" , ";
                                    i++;
                                    if(word[i].equals(";;"))
                                        return "Affectation de la valeur entière"+aux2 +" dans la variable"+aux ;
                                }
                                else if(number(word[i]) == "Real Number")
                                {
                                    aux2 += word[i]+" , ";
                                    i++;
                                    if(word[i].equals(";;"))
                                        return "affectation d un valeur reel"+aux2 +" dans variable "+aux;
                                }
                            }
                        }   break;
                    }
                case "ShowVal":
                    i++;
                    if(word[i].equals(":"))
                    {
                        i++;
                        if(ident(word[i]) != null)
                        {
                            i++;
                            if(word[i].equals(";;"))
                                return "Affichage de la valeur de "+word[i-1];
                        }
                    }
                    break;
                default:
                    break;
            }
        }
                    return "erreur de syntaxe";
        }
    
    
    public String analyseSemantique(String chaineCaractere)
    {   
        if(chaineCaractere.equals("Start_Program"))
        {
            return "public static void main(String[] args)\n"
                    + "{";
			
	}
        
        else if(chaineCaractere.contains(" "))    /*declaration*/
            {
                word = chaineCaractere.split(" ");
                if(word[0].equals("Int_Number"))
                {
                    if(!word[word.length-1].equals(";;"))
                        {return "Erreur sémantique !!";}
                    String aux = "int ";
                    for(int i = 2 ; i<word.length-1 ; i++)
                    {
                        
                        if(ident(word[i]) != null)
                        {
                            aux+= word[i];
                            if(word[word.length-1].equals(","))
                            {
                                aux+=" , ";
                        }
                    }
                }
                aux += ";";
                return aux;
		}
                
                else if(word[0].equals("Real_Number"))
                {
                    if(!word[word.length-1].equals(";;"))
                        return "Erreur sémantique !!";
                    String aux = "float ";
                    for(int i = 2 ;i<word.length-1;i++)
                    {
                        if(ident(word[i]) != null)
                        {
                            aux+= word[i];
                            if(word[word.length-1].equals(","))
                            {
                                aux+=" , ";
                            }
			}
                    }
                    aux += ";";
                    return aux;
		}
                else if(word[0].equals("Give")) /* affectation d'une valeur */
            {
                if(!word[word.length-1].equals(";;"))
                    return "Erreur sémantique !!";
                
                String aux = "";
		for(int i = 1 ; i<2 ; i++)
                {
                    if(ident(word[i]) != null)
                        aux+= word[i];
                    aux+=" = ";
                    i=i+2;
                    if(number(word[i]) != null)
                        if(number(word[i]) == "Real Number")
                            aux+= word[i];
                        else
                            if(number(word[i]) == "Integer Number")
                                aux+= word[i];
		}
                aux += " ;";
                
                return aux;
                
            }
                
            
                else if(word[0].equals("Affect"))  /* affectation d'une valeur */
            {
                if(!word[word.length-1].equals(";;"))
                    return "Erreur sémantique !!";
                
                String aux = " ";
		for(int i = 1 ; i<2 ; i++)
                {
                    if(ident(word[i]) != null)
                        aux+= word[i];
                    aux+=" = ";
                    i=i+2;
                    if(ident(word[i]) != null)
                        aux+= word[i];
                }
                aux += " ;";
                return aux;
            }
            
                else if(word[0].equals("If"))  /* condition */
            {
                if(word[1].equals("-"))
                {
                    if(!word[word.length-1].equals(";;"))
                        return "Erreur sémentique !!";
                    
                    String aux = "if ";
                    aux+="( ";
                    for(int i = 2 ; i<3 ; i++)
                    {
                        if(ident(word[i]) != null)
                        {
                            aux+= word[i];
                            switch (word[3])
                            {
                                case "<":
                                    aux+="<";
                                    break;
                                case ">":
                                    aux+=">";
                                    break;
                                case "=":
                                    aux+="==";
                                    break;
                                default:
                                    break;
                            }}
                            aux+= word[4];
                            aux += " )\n    ";
                            if(word[6].equals("Give"))
                            {   
                                if(ident(word[7]) != null)
                                    aux+= word[7];
                                aux+=" = ";
                                if(number(word[9]) != null && (word[9] == "Real Number" || number(word[9]) == "Integer Number"))
                                    aux+= word[9];
                                }
                            aux += " ;";
                        
                        
                    
                }return aux;}
                
            
                
            
            
                

            
            }
            }
        if(chaineCaractere.startsWith("ShowMes")) /* affichage message*/
        {
            String aux="printf(";
            for(int i = 2 ; i<word.length-1 ; i++)
            {
                aux+=" "+word[i];
            }
            aux+=");";
                    
                    return aux;
        }
           else if(chaineCaractere.startsWith("//."))
           { 
                String aux = "// ";
		for(int i = 1 ; i<word.length ; i++)
                {
                    if(ident(word[i]) != null)
                    {
                        aux+= word[i];
                        aux+=" ";
                    }
                }
                return aux;
            }
        
        
        else if(word[0].equals("ShowVal"))
                {
                    String aux="";
                    if(!word[word.length-1].equals(";;"))
                        return "Erreur sémantique !!";
                    if(ident(word[2]) != null)
                    {
                        
                        aux+=word[2];
                    }
                    aux+=" = "+" ;";
                 return aux;   
                }
             
            
            
        
        
        
            else if(chaineCaractere.equals("End_Program"))
                    return "}";
            else if(chaineCaractere.equals("Else"))
                    return "else";
            else if(chaineCaractere.equals("Start"))
                    return "{";
            else if(chaineCaractere.equals("Finish"))
                    return "}";
            
                
                
            
    return "Erreur sémantique !!";
            
}
    
    public static void load() throws FileNotFoundException
    {
        
        fileChooser.addChoosableFileFilter(fich);
        if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            File f = fileChooser.getSelectedFile();
            Scanner sc_lines = new Scanner(f);
            Scanner sc_words = new Scanner(f);
            words.clear();
            line.clear();
            while(sc_lines.hasNextLine())
            {
                line.add(sc_lines.nextLine());
            }
            while(sc_words.hasNext())
            {
                words.add(sc_words.next());
            }
            sc_words.close();
            sc_lines.close();
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try{
                    new Interface().setVisible(true);
                    
                    
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton chargerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    public javax.swing.JButton lexicaleButton;
    private javax.swing.JButton semantiqueButton;
    private javax.swing.JButton syntaxiqueButton;
    // End of variables declaration//GEN-END:variables
}
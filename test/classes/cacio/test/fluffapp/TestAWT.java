/*
 * TestAWT.java
 *
 * Created on 12-mag-2009, 15.00.30
 */

package cacio.test.fluffapp;

import java.awt.CardLayout;
import java.awt.CheckboxGroup;

/**
 * @author Mario Torre <neugens.limasoftware@gmail.com>
 */
public class TestAWT extends java.awt.Frame {

    /** Creates new form TestAWT */
    public TestAWT() {
        /*try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        topPane = new java.awt.Panel();
        textAreaButton = new java.awt.Button();
        choiceButton = new java.awt.Button();
        widgetsButton = new java.awt.Button();
        bottomPane = new java.awt.Panel();
        textAreaPane = new java.awt.Panel();
        textArea = new java.awt.TextArea();
        buttonPane = new java.awt.Panel();
        label1 = new java.awt.Label();
        choice1 = new java.awt.Choice();
        list1 = new java.awt.List(20, true);
        CheckboxGroup doYouLikeJ1 = new CheckboxGroup();
        checkbox3 = new java.awt.Checkbox("yes", doYouLikeJ1, true);
        checkbox6 = new java.awt.Checkbox("no", doYouLikeJ1, false);
        checkbox4 = new java.awt.Checkbox();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        checkbox1 = new java.awt.Checkbox();
        checkbox5 = new java.awt.Checkbox();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        widgetPane = new java.awt.Panel();
        menuBar = new java.awt.MenuBar();
        fileMenu = new java.awt.Menu();
        exitMenuItem = new java.awt.MenuItem();
        editMenu = new java.awt.Menu();
        enableMenuItem = new java.awt.CheckboxMenuItem();

        label8.setText("label6");

        label9.setText("label7");

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        textAreaButton.setLabel("Text Area");
        textAreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAreaButtonActionPerformed(evt);
            }
        });
        topPane.add(textAreaButton);

        choiceButton.setLabel("Choice Boxes");
        choiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceButtonActionPerformed(evt);
            }
        });
        topPane.add(choiceButton);

        widgetsButton.setLabel("Widgets");
        topPane.add(widgetsButton);

        add(topPane, java.awt.BorderLayout.NORTH);

        bottomPane.setLayout(new java.awt.CardLayout());

        textArea.setText("\"Canto quinto, nel quale mostra del secondo cerchio de l'inferno,\ne tratta de la pena del vizio de la lussuria ne la persona\ndi più famosi gentili uomini.\"\n\n \nCosì discesi del cerchio primaio\ngiù nel secondo, che men loco cinghia\ne tanto più dolor, che punge a guaio.\n\nStavvi Minòs orribilmente, e ringhia:\nessamina le colpe ne l'intrata;\ngiudica e manda secondo ch'avvinghia.\n\nDico che quando l'anima mal nata\nli vien dinanzi, tutta si confessa;\ne quel conoscitor de le peccata\n\nvede qual loco d'inferno è da essa;\ncignesi con la coda tante volte\nquantunque gradi vuol che giù sia messa.\n\nSempre dinanzi a lui ne stanno molte:\nvanno a vicenda ciascuna al giudizio,\ndicono e odono e poi son giù volte.\n\n\"O tu che vieni al doloroso ospizio\",\ndisse Minòs a me quando mi vide,\nlasciando l'atto di cotanto offizio,\n\n\"guarda com'entri e di cui tu ti fide;\nnon t'inganni l'ampiezza de l'intrare!\".\nE 'l duca mio a lui: \"Perché pur gride?\n\nNon impedir lo suo fatale andare:\nvuolsi così colà dove si puote\nciò che si vuole, e più non dimandare\".\n\nOr incomincian le dolenti note\na farmisi sentire; or son venuto\nlà dove molto pianto mi percuote.\n\nIo venni in loco d'ogne luce muto,\nche mugghia come fa mar per tempesta,\nse da contrari venti è combattuto.\n\nLa bufera infernal, che mai non resta,\nmena li spirti con la sua rapina;\nvoltando e percotendo li molesta.\n\nQuando giungon davanti a la ruina,\nquivi le strida, il compianto, il lamento;\nbestemmian quivi la virtù divina.\n\nIntesi ch'a così fatto tormento\nenno dannati i peccator carnali,\nche la ragion sommettono al talento.\n\nE come li stornei ne portan l'ali\nnel freddo tempo, a schiera larga e piena,\ncosì quel fiato li spiriti mali\n\ndi qua, di là, di giù, di sù li mena;\nnulla speranza li conforta mai,\nnon che di posa, ma di minor pena.\n\nE come i gru van cantando lor lai,\nfaccendo in aere di sé lunga riga,\ncosì vid'io venir, traendo guai,\n\nombre portate da la detta briga;\nper ch'i' dissi: \"Maestro, chi son quelle\ngenti che l'aura nera sì gastiga?\".\n\n\"La prima di color di cui novelle\ntu vuo' saper\", mi disse quelli allotta,\n\"fu imperadrice di molte favelle.\n\nA vizio di lussuria fu sì rotta,\nche libito fé licito in sua legge,\nper tòrre il biasmo in che era condotta.\n\nEll'è Semiramìs, di cui si legge\nche succedette a Nino e fu sua sposa:\ntenne la terra che 'l Soldan corregge.\n\nL'altra è colei che s'ancise amorosa,\ne ruppe fede al cener di Sicheo;\npoi è Cleopatràs lussurïosa.\n\nElena vedi, per cui tanto reo\ntempo si volse, e vedi 'l grande Achille,\nche con amore al fine combatteo.\n\nVedi Parìs, Tristano\"; e più di mille\nombre mostrommi e nominommi a dito,\nch'amor di nostra vita dipartille.\n\nPoscia ch'io ebbi 'l mio dottore udito\nnomar le donne antiche e ' cavalieri,\npietà mi giunse, e fui quasi smarrito.\n\nI' cominciai: \"Poeta, volontieri\nparlerei a quei due che 'nsieme vanno,\ne paion sì al vento esser leggeri\".\n\nEd elli a me: \"Vedrai quando saranno\npiù presso a noi; e tu allor li priega\nper quello amor che i mena, ed ei verranno\".\n\nSì tosto come il vento a noi li piega,\nmossi la voce: \"O anime affannate,\nvenite a noi parlar, s'altri nol niega!\".\n\nQuali colombe dal disio chiamate\ncon l'ali alzate e ferme al dolce nido\nvegnon per l'aere, dal voler portate;\n\ncotali uscir de la schiera ov'è Dido,\na noi venendo per l'aere maligno,\nsì forte fu l'affettüoso grido.\n\n\"O animal grazïoso e benigno\nche visitando vai per l'aere perso\nnoi che tignemmo il mondo di sanguigno,\n\nse fosse amico il re de l'universo,\nnoi pregheremmo lui de la tua pace,\npoi c' hai pietà del nostro mal perverso.\n\nDi quel che udire e che parlar vi piace,\nnoi udiremo e parleremo a voi,\nmentre che 'l vento, come fa, ci tace.\n\nSiede la terra dove nata fui\nsu la marina dove 'l Po discende\nper aver pace co' seguaci sui.\n\nAmor, ch'al cor gentil ratto s'apprende,\nprese costui de la bella persona\nche mi fu tolta; e 'l modo ancor m'offende.\n\nAmor, ch'a nullo amato amar perdona,\nmi prese del costui piacer sì forte,\nche, come vedi, ancor non m'abbandona.\n\nAmor condusse noi ad una morte.\nCaina attende chi a vita ci spense\".\nQueste parole da lor ci fuor porte.\n\nQuand'io intesi quell'anime offense,\nchina' il viso, e tanto il tenni basso,\nfin che 'l poeta mi disse: \"Che pense?\".\n\nQuando rispuosi, cominciai: \"Oh lasso,\nquanti dolci pensier, quanto disio\nmenò costoro al doloroso passo!\".\n\nPoi mi rivolsi a loro e parla' io,\ne cominciai: \"Francesca, i tuoi martìri\na lagrimar mi fanno tristo e pio.\n\nMa dimmi: al tempo d'i dolci sospiri,\na che e come concedette amore\nche conosceste i dubbiosi disiri?\".\n\nE quella a me: \"Nessun maggior dolore\nche ricordarsi del tempo felice\nne la miseria; e ciò sa 'l tuo dottore.\n\nMa s'a conoscer la prima radice\ndel nostro amor tu hai cotanto affetto,\ndirò come colui che piange e dice.\n\nNoi leggiavamo un giorno per diletto\ndi Lancialotto come amor lo strinse;\nsoli eravamo e sanza alcun sospetto.\n\nPer più fïate li occhi ci sospinse\nquella lettura, e scolorocci il viso;\nma solo un punto fu quel che ci vinse.\n\nQuando leggemmo il disïato riso\nesser basciato da cotanto amante,\nquesti, che mai da me non fia diviso,\n\nla bocca mi basciò tutto tremante.\nGaleotto fu 'l libro e chi lo scrisse:\nquel giorno più non vi leggemmo avante\".\n\nMentre che l'uno spirto questo disse,\nl'altro piangëa; sì che di pietade\nio venni men così com'io morisse.\n\nE caddi come corpo morto cade.");

        javax.swing.GroupLayout textAreaPaneLayout = new javax.swing.GroupLayout(textAreaPane);
        textAreaPane.setLayout(textAreaPaneLayout);
        textAreaPaneLayout.setHorizontalGroup(
            textAreaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAreaPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
        textAreaPaneLayout.setVerticalGroup(
            textAreaPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAreaPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );

        bottomPane.add(textAreaPane, "card2");

        label1.setText("Number of girlfriends:");

        choice1.setName("1-13"); // NOI18N
        choice1.add("Not so many...");
        choice1.add("Quite a lot!");
        choice1.add("A huge number!");

        list1.add("Dedicated to");
        list1.add("all the friends");
        list1.add("that made this possible");
        list1.add("to our families");
        list1.add("our dogs");
        list1.add("Madeleine,");
        list1.add("who spent countless");
        list1.add("hours waiting for us");
        list1.add("and to Marlise,");
        list1.add("my sweet girlfriend");
        list1.add("because I love her so much!");
        list1.add("---");
        list1.add("this does nothing too");
        list1.add("just to show");
        list1.add("the scroll bars");
        list1.add("because the ninbus laf");
        list1.add("is soo cool!");
        list1.add("really!");
        list1.add("Come on, ");
        list1.add("trust me!");

        checkbox3.setLabel("yes");

        checkbox6.setLabel("no");

        checkbox4.setLabel("to see");

        label2.setText("Add your comments below:");

        label3.setText("Do you like Java One?");

        textArea1.setText("All work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy\nAll work and no play makes Jack a dull boy All work and no play makes Jack a dull boy");

        label4.setText("Dedicated to:");

        label5.setText("Broken UI:");

        checkbox1.setLabel("but is nice");

        checkbox5.setLabel("Does nothing");

        label6.setText("label6");

        label7.setText("label7");

        javax.swing.GroupLayout buttonPaneLayout = new javax.swing.GroupLayout(buttonPane);
        buttonPane.setLayout(buttonPaneLayout);
        buttonPaneLayout.setHorizontalGroup(
            buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(buttonPaneLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(buttonPaneLayout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(buttonPaneLayout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        buttonPaneLayout.setVerticalGroup(
            buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        bottomPane.add(buttonPane, "card3");

        javax.swing.GroupLayout widgetPaneLayout = new javax.swing.GroupLayout(widgetPane);
        widgetPane.setLayout(widgetPaneLayout);
        widgetPaneLayout.setHorizontalGroup(
            widgetPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        widgetPaneLayout.setVerticalGroup(
            widgetPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        bottomPane.add(widgetPane, "card4");

        add(bottomPane, java.awt.BorderLayout.CENTER);

        fileMenu.setLabel("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        exitMenuItem.setLabel("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setLabel("Edit");

        enableMenuItem.setLabel("Enable");
        enableMenuItem.setState(true);
        enableMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                enableMenuItemItemStateChanged(evt);
            }
        });
        enableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(enableMenuItem);

        menuBar.add(editMenu);

        setMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void textAreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAreaButtonActionPerformed
        CardLayout cl = (CardLayout)(bottomPane.getLayout());
        cl.show(bottomPane, "card2");
}//GEN-LAST:event_textAreaButtonActionPerformed

    private void choiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceButtonActionPerformed
        CardLayout cl = (CardLayout)(bottomPane.getLayout());
        cl.show(bottomPane, "card3");
}//GEN-LAST:event_choiceButtonActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fileMenuActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed

        System.exit(0);
}//GEN-LAST:event_exitMenuItemActionPerformed

    private void enableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableMenuItemActionPerformed

        bottomPane.setEnabled(enableMenuItem.getState());
}//GEN-LAST:event_enableMenuItemActionPerformed

    private void enableMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_enableMenuItemItemStateChanged

        System.out.println("enableMenuItemItemStateChanged: " + enableMenuItem.getState());
        bottomPane.setEnabled(enableMenuItem.getState());
    }//GEN-LAST:event_enableMenuItemItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestAWT().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel bottomPane;
    private java.awt.Panel buttonPane;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private java.awt.Checkbox checkbox5;
    private java.awt.Checkbox checkbox6;
    private java.awt.Choice choice1;
    private java.awt.Button choiceButton;
    private java.awt.Menu editMenu;
    private java.awt.CheckboxMenuItem enableMenuItem;
    private java.awt.MenuItem exitMenuItem;
    private java.awt.Menu fileMenu;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.List list1;
    private java.awt.MenuBar menuBar;
    private java.awt.TextArea textArea;
    private java.awt.TextArea textArea1;
    private java.awt.Button textAreaButton;
    private java.awt.Panel textAreaPane;
    private java.awt.Panel topPane;
    private java.awt.Panel widgetPane;
    private java.awt.Button widgetsButton;
    // End of variables declaration//GEN-END:variables

}
import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {
	
	public Fenetre (String titre) {
		super(titre);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500,250);
		setLocation(0,200);
		
		Container contentPane = getContentPane() ;
		
		//Menu
		JMenuBar m= new JMenuBar();
		
		JMenu fichiers= new JMenu("Fichiers");
			JMenuItem ouvrir = new JMenuItem("Ouvrir") ;
			JMenuItem nouveau = new JMenuItem("Nouveau") ;
			JMenuItem sauver = new JMenuItem("Sauver");
			JMenuItem quitter = new JMenuItem("Quitter") ;
			fichiers.add(ouvrir);
			fichiers.add(nouveau);
			fichiers.add(sauver);
			sauver.setAccelerator(KeyStroke.getKeyStroke('S',Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
			fichiers.addSeparator();
			fichiers.add(quitter);
		
		m.add(fichiers);
		
		JMenu apropos = new JMenu("A propos");
			apropos.add(new JMenuItem("Auteurs"));
			
		m.add(apropos);
		setJMenuBar(m);
		
		//Zone de texte
		contentPane.add(new JTextArea("test"),"Center");
		
		//Panneaux
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(1,2));
		
		JPanel panocouleur = new JPanel();
		panocouleur.setLayout(new GridLayout(2,4));
			
		
		JPanel panofigure= new JPanel();
		panofigure.setLayout(new GridLayout(2,2));
		
		pan1.add(panocouleur);
		pan1.add(panofigure);
		
		//Bouttons
		
		JButton monboutonnoir = new JButton("Noir");
		monboutonnoir.setBackground(Color.black);
		JButton monboutonrouge = new JButton("Rouge");
		monboutonrouge.setBackground(Color.red);
		JButton monboutonvert = new JButton("Vert");
		monboutonvert.setBackground(Color.green);
		JButton monboutonbleu = new JButton("Bleu");
		monboutonbleu.setBackground(Color.blue);
		JButton monboutonjaune = new JButton("Jaune");
		monboutonjaune.setBackground(Color.yellow);
		JButton monboutonrose = new JButton("Rose");
		monboutonrose.setBackground(Color.pink);
		JButton monboutonmagenta = new JButton("Magenta");
		monboutonmagenta.setBackground(Color.magenta);
		JButton monboutonorange = new JButton("Orange");
		monboutonorange.setBackground(Color.orange);
		
		panocouleur.add(monboutonnoir);
		panocouleur.add(monboutonrouge);
		panocouleur.add(monboutonvert);
		panocouleur.add(monboutonbleu);
		panocouleur.add(monboutonjaune);
		panocouleur.add(monboutonrose);
		panocouleur.add(monboutonmagenta);
		panocouleur.add(monboutonorange);
		
		JButton monboutonellipse = new JButton("Ellipse");
		JButton monboutoncercle = new JButton("Cercle");
		JButton monboutoncarre = new JButton("Carre");
		JButton monboutonrectangle = new JButton("Rectangle");
		
		panofigure.add(monboutonellipse);
		panofigure.add(monboutoncercle);
		panofigure.add(monboutoncarre);
		panofigure.add(monboutonrectangle);
		
		contentPane.add(pan1,"South");
		setVisible(true);
	}
}

package org.baderlab.st.internal.actions;

import java.awt.event.ActionEvent;

import org.cytoscape.application.swing.AbstractCyAction;

@SuppressWarnings("serial")
public class EnvVarAction extends AbstractCyAction {

    public EnvVarAction() {
        super("Print Environment Variables");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Environment Variables");
        System.getenv().forEach((var, value) -> {
           System.out.println(var + "=" + value); 
        });
        
        System.out.println("\nSystem Properties");
        System.getProperties().forEach((var, value) -> {
            System.out.println(var + "=" + value);
        });
    }
    

}

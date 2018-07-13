package com.SamplersApplication;

import android.os.Bundle;
import java.util.ArrayList;
import org.cientopolis.samplers.ui.SamplersMainActivity;
import org.cientopolis.samplers.network.NetworkConfiguration;
import org.cientopolis.samplers.framework.*;
import org.cientopolis.samplers.framework.information.*;
import org.cientopolis.samplers.framework.insertDate.*;
import org.cientopolis.samplers.framework.insertText.*;
import org.cientopolis.samplers.framework.insertTime.*;
import org.cientopolis.samplers.framework.location.*;
import org.cientopolis.samplers.framework.multipleSelect.*;
import org.cientopolis.samplers.framework.selectOne.*;
import org.cientopolis.samplers.framework.photo.*;
import org.cientopolis.samplers.framework.soundRecord.*;
import org.cientopolis.samplers.framework.route.*;
import org.cientopolis.samplers.authentication.AuthenticationManager;

public class SamplersApplication extends SamplersMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NetworkConfiguration.setURL("http://192.168.0.10/samplers/upload.php");
        NetworkConfiguration.setPARAM_NAME_SAMPLE("sample");
        NetworkConfiguration.setPARAM_NAME_USER_ID("user_id");
        NetworkConfiguration.setPARAM_NAME_AUTHENTICATION_TYPE("authentication_type");
        AuthenticationManager.setAuthenticationEnabled(true);
        AuthenticationManager.setAuthenticationOptional(true);
        String welcomeMessage = getResources().getString(R.string.welcomeMessage); 
        lb_main_welcome_message.setText(welcomeMessage);
    }

    @Override
    protected Workflow getWorkflow() {
        Workflow workflow = new Workflow();
    String textToShow0 = getResources().getString(R.string.textToShow0); 
    InformationStep step0 = new InformationStep(1,textToShow0,2); 
    workflow.addStep(step0); 
    String selectOneTitle1 = getResources().getString(R.string.selectOneTitle1); 
    ArrayList<SelectOneOption> optionsToSelectOne1 = new ArrayList<SelectOneOption>();
    String selectOneOptionText1_0 = getResources().getString(R.string.selectOneOptionText1_0); 
    optionsToSelectOne1.add(new SelectOneOption(1,selectOneOptionText1_0, 3));
    String selectOneOptionText1_1 = getResources().getString(R.string.selectOneOptionText1_1); 
    optionsToSelectOne1.add(new SelectOneOption(2,selectOneOptionText1_1, 3));
    String selectOneOptionText1_2 = getResources().getString(R.string.selectOneOptionText1_2); 
    optionsToSelectOne1.add(new SelectOneOption(3,selectOneOptionText1_2, 4));
    SelectOneStep step1 = new SelectOneStep(2,optionsToSelectOne1,selectOneTitle1); 
    workflow.addStep(step1); 
    String photoInstructions2 = getResources().getString(R.string.photoInstructions2); 
    PhotoStep step2 = new PhotoStep(3,photoInstructions2,5); 
    workflow.addStep(step2); 
    String photoInstructions3 = getResources().getString(R.string.photoInstructions3); 
    PhotoStep step3 = new PhotoStep(4,photoInstructions3,8); 
    workflow.addStep(step3); 
    String selectOneTitle4 = getResources().getString(R.string.selectOneTitle4); 
    ArrayList<SelectOneOption> optionsToSelectOne4 = new ArrayList<SelectOneOption>();
    String selectOneOptionText4_0 = getResources().getString(R.string.selectOneOptionText4_0); 
    optionsToSelectOne4.add(new SelectOneOption(1,selectOneOptionText4_0, 6));
    String selectOneOptionText4_1 = getResources().getString(R.string.selectOneOptionText4_1); 
    optionsToSelectOne4.add(new SelectOneOption(2,selectOneOptionText4_1, 7));
    SelectOneStep step4 = new SelectOneStep(5,optionsToSelectOne4,selectOneTitle4); 
    workflow.addStep(step4); 
    String photoInstructions5 = getResources().getString(R.string.photoInstructions5); 
    PhotoStep step5 = new PhotoStep(6,photoInstructions5,7); 
    workflow.addStep(step5); 
    String textToShowInsertText6 = getResources().getString(R.string.textToShowInsertText6); 
    String sampleTextInsertText6 = getResources().getString(R.string.sampleTextInsertText6); 
    InsertTextStep step6 = new InsertTextStep(7,textToShowInsertText6,sampleTextInsertText6,3,InsertTextStep.InputType.TYPE_NUMBER,true,8); 
    workflow.addStep(step6); 
    String textToShowLocation7 = getResources().getString(R.string.textToShowLocation7); 
    LocationStep step7 = new LocationStep(8,textToShowLocation7,null); 
    workflow.addStep(step7); 
        return workflow;
    }
    @Override
    protected Integer getMainHelpResourceId() {
        return null;
    }
}

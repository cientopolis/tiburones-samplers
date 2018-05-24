package com.SamplersApplication.;

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

public class SamplersApplicationMyMainSamplersActivity extends SamplersMainActivity {

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
    optionsToSelectOne1.add(new SelectOneOption(3,selectOneOptionText1_2, 3));
    SelectOneStep step1 = new SelectOneStep(2,optionsToSelectOne1,selectOneTitle1); 
    workflow.addStep(step1); 
    String photoInstructions2 = getResources().getString(R.string.photoInstructions2); 
    PhotoStep step2 = new PhotoStep(3,photoInstructions2,4); 
    workflow.addStep(step2); 
    String selectOneTitle3 = getResources().getString(R.string.selectOneTitle3); 
    ArrayList<SelectOneOption> optionsToSelectOne3 = new ArrayList<SelectOneOption>();
    String selectOneOptionText3_0 = getResources().getString(R.string.selectOneOptionText3_0); 
    optionsToSelectOne3.add(new SelectOneOption(1,selectOneOptionText3_0, 5));
    String selectOneOptionText3_1 = getResources().getString(R.string.selectOneOptionText3_1); 
    optionsToSelectOne3.add(new SelectOneOption(2,selectOneOptionText3_1, 6));
    SelectOneStep step3 = new SelectOneStep(4,optionsToSelectOne3,selectOneTitle3); 
    workflow.addStep(step3); 
    String photoInstructions4 = getResources().getString(R.string.photoInstructions4); 
    PhotoStep step4 = new PhotoStep(5,photoInstructions4,6); 
    workflow.addStep(step4); 
    String textToShowInsertText5 = getResources().getString(R.string.textToShowInsertText5); 
    String sampleTextInsertText5 = getResources().getString(R.string.sampleTextInsertText5); 
    InsertTextStep step5 = new InsertTextStep(6,textToShowInsertText5,sampleTextInsertText5,3,InsertTextStep.InputType.TYPE_TEXT,true,7); 
    workflow.addStep(step5); 
    String textToShowLocation6 = getResources().getString(R.string.textToShowLocation6); 
    LocationStep step6 = new LocationStep(7,textToShowLocation6,null); 
    workflow.addStep(step6); 
        return workflow;
    }
    @Override
    protected Integer getMainHelpResourceId() {
        return null;
    }
}

package com.example.santiago.test_samplers;

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

public class test_samplersMyMainSamplersActivity extends SamplersMainActivity {

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
    String textToShowLocation1 = getResources().getString(R.string.textToShowLocation1); 
    LocationStep step1 = new LocationStep(2,textToShowLocation1,3); 
    workflow.addStep(step1); 
    String multipleSelectTitle2 = getResources().getString(R.string.multipleSelectTitle2); 
    ArrayList<MultipleSelectOption> optionsToSelect2 = new ArrayList<MultipleSelectOption>();
    String multipleSelectOptionText2_0 = getResources().getString(R.string.multipleSelectOptionText2_0); 
    optionsToSelect2.add(new MultipleSelectOption(1,multipleSelectOptionText2_0));
    String multipleSelectOptionText2_1 = getResources().getString(R.string.multipleSelectOptionText2_1); 
    optionsToSelect2.add(new MultipleSelectOption(2,multipleSelectOptionText2_1));
    String multipleSelectOptionText2_2 = getResources().getString(R.string.multipleSelectOptionText2_2); 
    optionsToSelect2.add(new MultipleSelectOption(3,multipleSelectOptionText2_2));
    String multipleSelectOptionText2_3 = getResources().getString(R.string.multipleSelectOptionText2_3); 
    optionsToSelect2.add(new MultipleSelectOption(4,multipleSelectOptionText2_3));
    MultipleSelectStep step2 = new MultipleSelectStep(3,optionsToSelect2,multipleSelectTitle2,4); 
    workflow.addStep(step2); 
    String selectOneTitle3 = getResources().getString(R.string.selectOneTitle3); 
    ArrayList<SelectOneOption> optionsToSelectOne3 = new ArrayList<SelectOneOption>();
    String selectOneOptionText3_0 = getResources().getString(R.string.selectOneOptionText3_0); 
    optionsToSelectOne3.add(new SelectOneOption(1,selectOneOptionText3_0, 5));
    String selectOneOptionText3_1 = getResources().getString(R.string.selectOneOptionText3_1); 
    optionsToSelectOne3.add(new SelectOneOption(2,selectOneOptionText3_1, 5));
    String selectOneOptionText3_2 = getResources().getString(R.string.selectOneOptionText3_2); 
    optionsToSelectOne3.add(new SelectOneOption(3,selectOneOptionText3_2, 5));
    String selectOneOptionText3_3 = getResources().getString(R.string.selectOneOptionText3_3); 
    optionsToSelectOne3.add(new SelectOneOption(4,selectOneOptionText3_3, 5));
    SelectOneStep step3 = new SelectOneStep(4,optionsToSelectOne3,selectOneTitle3); 
    workflow.addStep(step3); 
    String photoInstructions4 = getResources().getString(R.string.photoInstructions4); 
    PhotoStep step4 = new PhotoStep(5,photoInstructions4,6); 
    workflow.addStep(step4); 
    String textToShowInsertDate5 = getResources().getString(R.string.textToShowInsertDate5); 
    InsertDateStep step5 = new InsertDateStep(6,textToShowInsertDate5,7); 
    workflow.addStep(step5); 
    String textToShowInsertTime6 = getResources().getString(R.string.textToShowInsertTime6); 
    InsertTimeStep step6 = new InsertTimeStep(7,textToShowInsertTime6,8); 
    workflow.addStep(step6); 
    String textToShowInsertText7 = getResources().getString(R.string.textToShowInsertText7); 
    String sampleTextInsertText7 = getResources().getString(R.string.sampleTextInsertText7); 
    InsertTextStep step7 = new InsertTextStep(8,textToShowInsertText7,sampleTextInsertText7,50,InsertTextStep.InputType.TYPE_TEXT,true,9); 
    workflow.addStep(step7); 
    String instructionsToShow8 = getResources().getString(R.string.instructionsToShow8); 
    SoundRecordStep step8 = new SoundRecordStep(9,instructionsToShow8,10); 
    workflow.addStep(step8); 
    String textToShowRoute9 = getResources().getString(R.string.textToShowRoute9); 
    RouteStep step9 = new RouteStep(10,textToShowRoute9,null); 
    workflow.addStep(step9); 
        return workflow;
    }
    @Override
    protected Integer getMainHelpResourceId() {
        return null;
    }
}

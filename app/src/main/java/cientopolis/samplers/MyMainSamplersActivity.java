package cientopolis.samplers;

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

public class MyMainSamplersActivity extends SamplersMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NetworkConfiguration.setURL("http://192.168.0.10/samplers/upload.php");
        NetworkConfiguration.setPARAM_NAME_SAMPLE("sample");
        NetworkConfiguration.setPARAM_NAME_USER_ID("user_id");
        NetworkConfiguration.setPARAM_NAME_AUTHENTICATION_TYPE("authentication_type");
        AuthenticationManager.setAuthenticationEnabled(false);
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
    optionsToSelectOne1.add(new SelectOneOption(2,selectOneOptionText1_1, 4));
    String selectOneOptionText1_2 = getResources().getString(R.string.selectOneOptionText1_2); 
    optionsToSelectOne1.add(new SelectOneOption(3,selectOneOptionText1_2, 5));
    SelectOneStep step1 = new SelectOneStep(2,optionsToSelectOne1,selectOneTitle1); 
    workflow.addStep(step1); 
    String photoInstructions2 = getResources().getString(R.string.photoInstructions2); 
    PhotoStep step2 = new PhotoStep(3,photoInstructions2,6); 
    workflow.addStep(step2); 
    String photoInstructions3 = getResources().getString(R.string.photoInstructions3); 
    PhotoStep step3 = new PhotoStep(4,photoInstructions3,8); 
    workflow.addStep(step3); 
    String photoInstructions4 = getResources().getString(R.string.photoInstructions4); 
    PhotoStep step4 = new PhotoStep(5,photoInstructions4,10); 
    workflow.addStep(step4); 
    String selectOneTitle5 = getResources().getString(R.string.selectOneTitle5); 
    ArrayList<SelectOneOption> optionsToSelectOne5 = new ArrayList<SelectOneOption>();
    String selectOneOptionText5_0 = getResources().getString(R.string.selectOneOptionText5_0); 
    optionsToSelectOne5.add(new SelectOneOption(1,selectOneOptionText5_0, 7));
    String selectOneOptionText5_1 = getResources().getString(R.string.selectOneOptionText5_1); 
    optionsToSelectOne5.add(new SelectOneOption(2,selectOneOptionText5_1, 8));
    SelectOneStep step5 = new SelectOneStep(6,optionsToSelectOne5,selectOneTitle5); 
    workflow.addStep(step5); 
    String photoInstructions6 = getResources().getString(R.string.photoInstructions6); 
    PhotoStep step6 = new PhotoStep(7,photoInstructions6,8); 
    workflow.addStep(step6); 
    String textToShowInsertText7 = getResources().getString(R.string.textToShowInsertText7); 
    String sampleTextInsertText7 = getResources().getString(R.string.sampleTextInsertText7); 
    InsertTextStep step7 = new InsertTextStep(8,textToShowInsertText7,sampleTextInsertText7,3,InsertTextStep.InputType.TYPE_NUMBER,true,9); 
    workflow.addStep(step7); 
    String textToShowLocation8 = getResources().getString(R.string.textToShowLocation8); 
    LocationStep step8 = new LocationStep(9,textToShowLocation8,null); 
    workflow.addStep(step8); 
    String selectOneTitle9 = getResources().getString(R.string.selectOneTitle9); 
    ArrayList<SelectOneOption> optionsToSelectOne9 = new ArrayList<SelectOneOption>();
    String selectOneOptionText9_0 = getResources().getString(R.string.selectOneOptionText9_0); 
    optionsToSelectOne9.add(new SelectOneOption(1,selectOneOptionText9_0, 9));
    String selectOneOptionText9_1 = getResources().getString(R.string.selectOneOptionText9_1); 
    optionsToSelectOne9.add(new SelectOneOption(2,selectOneOptionText9_1, 9));
    String selectOneOptionText9_2 = getResources().getString(R.string.selectOneOptionText9_2); 
    optionsToSelectOne9.add(new SelectOneOption(3,selectOneOptionText9_2, 9));
    String selectOneOptionText9_3 = getResources().getString(R.string.selectOneOptionText9_3); 
    optionsToSelectOne9.add(new SelectOneOption(4,selectOneOptionText9_3, 9));
    SelectOneStep step9 = new SelectOneStep(10,optionsToSelectOne9,selectOneTitle9); 
    workflow.addStep(step9); 
        return workflow;
    }
    @Override
    protected Integer getMainHelpResourceId() {
        return null;
    }
}

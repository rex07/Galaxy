package in.dragons.galaxy.task;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import in.dragons.galaxy.model.App;

public class ConvertToNormalTask extends SystemRemountTask {

    public ConvertToNormalTask(Context context, App app) {
        super(context, app);
    }

    @Override
    protected List<String> getCommands() {
        List<String> commands = new ArrayList<>();
        String from = app.getPackageInfo().applicationInfo.sourceDir;
        commands.add(getBusyboxCommand("mv " + from + " /data/app"));
        return commands;
    }
}

package edu.usf.cutr.trackerlib.server;

import java.util.List;

import edu.usf.cutr.trackerlib.data.TrackData;

/**
 * Created by cagricetin on 4/21/15.
 */
public class TraccarServer extends BaseTrackerServer{

    public TraccarServer(String url) {
        super(url);
    }

    @Override
    public void sendTrackData(TrackData trackData) {

    }

    @Override
    public void sendAllTrackData(List<TrackData> trackDataList) {

    }
}

package com.frostwire.jlibtorrent;

/**
 * @author gubatron
 * @author aldenml
 */
public final class SessionStats {

    private final JavaStat stat;

    private long dhtNodes;

    SessionStats(JavaStat stat) {
        this.stat = stat;
    }

    public long downloadPayload() {
        return stat.downloadPayload();
    }

    public long uploadPayload() {
        return stat.uploadPayload();
    }

    public long download() {
        return stat.download();
    }

    public long upload() {
        return stat.upload();
    }

    public long downloadRate() {
        return stat.downloadRate();
    }

    public long uploadRate() {
        return stat.uploadRate();
    }

    public long dhtNodes() {
        return dhtNodes;
    }

    void dhtNodes(long value) {
        dhtNodes = value;
    }
}

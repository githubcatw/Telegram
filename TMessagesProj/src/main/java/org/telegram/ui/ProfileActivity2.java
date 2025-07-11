package org.telegram.ui;

import static org.telegram.messenger.AndroidUtilities.dp;
import static org.telegram.messenger.AndroidUtilities.lerp;

import android.os.Bundle;
import android.view.View;

import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class ProfileActivity2 extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, DialogsActivity.DialogsActivityDelegate, SharedMediaLayout.SharedMediaPreloaderDelegate, ImageUpdater.ImageUpdaterDelegate, SharedMediaLayout.Delegate {

    private final SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private long userId;
    private TLRPC.EncryptedChat currentEncryptedChat;
    private long chatId;
    private long topicId;

    public ProfileActivity2(Bundle args) {
        this(args, null);
    }

    public ProfileActivity2(Bundle args, SharedMediaLayout.SharedMediaPreloader preloader) {
        super(args);
        sharedMediaPreloader = preloader;
    }

    @Override
    public void didReceivedNotification(int id, int account, Object... args) {

    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile photo, TLRPC.InputFile video, double videoStartTimestamp, String videoPath, TLRPC.PhotoSize bigSize, TLRPC.PhotoSize smallSize, boolean isVideo, TLRPC.VideoSize emojiMarkup) {

    }

    @Override
    public void scrollToSharedMedia() {

    }

    @Override
    public boolean onMemberClick(TLRPC.ChatParticipant participant, boolean b, boolean resultOnly, View view) {
        return false;
    }

    @Override
    public TLRPC.Chat getCurrentChat() {
        return null;
    }

    @Override
    public boolean isFragmentOpened() {
        return false;
    }

    @Override
    public RecyclerListView getListView() {
        return null;
    }

    @Override
    public boolean canSearchMembers() {
        return false;
    }

    @Override
    public void updateSelectedMediaTabText() {

    }

    @Override
    public void mediaCountUpdated() {

    }


    @Override
    public boolean onFragmentCreate() {
        return false;
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity fragment, ArrayList<MessagesStorage.TopicKey> dids, CharSequence message, boolean param, boolean notify, int scheduleDate, TopicsFragment topicsFragment) {
        return false;
    }

    public void setPlayProfileAnimation(int i) {
    }
}

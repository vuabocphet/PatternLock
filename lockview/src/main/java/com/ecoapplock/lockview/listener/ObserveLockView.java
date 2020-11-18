package com.ecoapplock.lockview.listener;

import com.ecoapplock.lockview.PatternLockView;

import java.util.List;

public interface ObserveLockView {

    /**
     * Fired when the pattern drawing has just started
     */
    void onStarted();

    void onProgress(List<PatternLockView.Dot> progressPattern);

    void onComplete(List<PatternLockView.Dot> pattern);

    void onCleared();
}
package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInSineInterpolator extends Reverser {
    @Override
    protected Interpolator getSourceInterpolator() {
        return new EaseOutSineInterpolator();
    }
}
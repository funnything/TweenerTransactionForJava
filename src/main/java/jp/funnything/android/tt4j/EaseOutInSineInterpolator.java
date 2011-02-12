package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInSineInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutSineInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInSineInterpolator();
    }
}

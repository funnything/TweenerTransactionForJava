package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutSineInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInSineInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutSineInterpolator();
    }
}

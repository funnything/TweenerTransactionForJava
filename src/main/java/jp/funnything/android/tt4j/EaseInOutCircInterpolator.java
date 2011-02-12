package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutCircInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInCircInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutCircInterpolator();
    }
}

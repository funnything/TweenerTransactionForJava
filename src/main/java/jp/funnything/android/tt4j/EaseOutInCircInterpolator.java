package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInCircInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutCircInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInCircInterpolator();
    }
}

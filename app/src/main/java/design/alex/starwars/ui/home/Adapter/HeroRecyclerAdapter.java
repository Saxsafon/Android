package design.alex.starwars.ui.home.Adapter;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import design.alex.starwars.R;
import design.alex.starwars.data.model.entity.People;
import design.alex.starwars.ui.widgets.TemplateTextView;

public class HeroRecyclerAdapter
        extends
        RecyclerView.Adapter {

    public interface Listener {

        void onClickPeople(People people);
    }

    private static final int VIEW_PROGRESS = 1;
    private static final int VIEW_ITEM = 2;

    private List<People> mPeoples = new ArrayList<>();
    private Listener mListener;

    public void addAll(List<People> peoples) {
        mPeoples.addAll(peoples);
        notifyDataSetChanged();
    }

    public void setListener(Listener listener) {
        mListener = listener;
    }

    public void showProgress() {
        if (mPeoples.isEmpty() || !(mPeoples.get(getItemCount() - 1) instanceof People.Empty)) {
            mPeoples.add(new People.Empty());
            notifyItemInserted(getItemCount() - 1);
        }
    }

    public void hideProgress() {
        if (!mPeoples.isEmpty() && mPeoples.get(getItemCount() - 1) instanceof People.Empty) {
            mPeoples.remove(getItemCount() - 1);
            notifyItemRemoved(getItemCount());
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        if (viewType == VIEW_ITEM) {
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_card_wrapper, viewGroup, false);
            return new HeroViewHolder(view);
        } else {
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_progress, viewGroup, false);
            return new ProgressViewHolder(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mPeoples.get(position) instanceof People.Empty) {
            return VIEW_PROGRESS;
        } else {
            return VIEW_ITEM;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof HeroViewHolder) {
            ((HeroViewHolder)viewHolder).setPosition(position);
            People people = mPeoples.get(position);
            ((HeroViewHolder)viewHolder).bind(people);
        }
    }

    @Override
    public int getItemCount() {
        return mPeoples.size();
    }



    public class HeroViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.image) ImageView mHeroImageView;
        @BindView(R.id.person_name_text_view) TextView mHeroNameTextView;
        @BindView(R.id.person_birth_text_view) TemplateTextView mHeroBirthTextView;
        @BindView(R.id.person_height_text_view) TemplateTextView mHeroHeightTextView;
        @BindView(R.id.person_mass_text_view) TemplateTextView mHeroMassTextView;
        @BindView(R.id.person_gender_text_view) TemplateTextView mHeroGenderTextView;

        private int mPosition;

        HeroViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void setPosition(int position) {
            mPosition = position;
        }

        @OnClick(R.id.container)
        public void onClick() {
            if (mListener != null) {
                mListener.onClickPeople(mPeoples.get(mPosition));
            }
        }

        public void bind(People people) {
            Resources resources = mHeroNameTextView.getResources();

            Glide.with(mHeroImageView.getContext()).load(people.getImageUrl()).into(mHeroImageView);

            mHeroNameTextView.setText(people.getName());
            mHeroBirthTextView.setTemplatedText(people.getBirthYear());
            mHeroHeightTextView.setTemplatedText(String.valueOf(people.getHeight()));
            mHeroMassTextView.setTemplatedText(String.valueOf(people.getMass()));
            mHeroGenderTextView.setTemplatedText(String.valueOf(people.getGender()));
        }
    }

    public static class ProgressViewHolder extends RecyclerView.ViewHolder {

        public ProgressViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

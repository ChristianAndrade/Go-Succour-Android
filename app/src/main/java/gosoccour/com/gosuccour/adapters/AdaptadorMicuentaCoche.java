package gosoccour.com.gosuccour.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import gosoccour.com.gosuccour.models.Car;
import gosoccour.com.gosuccour.R;


/**
 * Created by alguien on 05/23/2018.
 */

public class AdaptadorMicuentaCoche extends RecyclerView.Adapter<AdaptadorMicuentaCoche.ViewHolder>{

    ArrayList<Car> cars;

    public AdaptadorMicuentaCoche(ArrayList<Car> cars) {
        this.cars=cars;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView modelo, matricula, neumaticos, motor;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            modelo = (TextView) itemView.findViewById(R.id.texto_modelo);
            matricula = (TextView) itemView.findViewById(R.id.texto_matricula);
            neumaticos = (TextView) itemView.findViewById(R.id.texto_neumaticos);
            motor = (TextView) itemView.findViewById(R.id.texto_motor);
            image = (ImageView) itemView.findViewById(R.id.logoMarca);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_coche, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String marca=cars.get(position).getModel();

        holder.neumaticos.setText("Neumaticos: " + cars.get(position).getPneumatic());
        holder.matricula.setText("Matricula: " + cars.get(position).getMatriculation());
        holder.modelo.setText(cars.get(position).getModel());
        holder.motor.setText("Motor: " + cars.get(position).getTypeMotor());

        switch (marca){
            case "Audi":
                holder.image.setImageResource(R.drawable.audi);
                break;
            case "Alpina":
                holder.image.setImageResource(R.drawable.alpina);
                break;
            case "Chevrolet":
                holder.image.setImageResource(R.drawable.chevrolet);
                break;
            case "Suzuki":
                holder.image.setImageResource(R.drawable.suzuki);
                break;
            case "Bmw":
                holder.image.setImageResource(R.drawable.bmw);
                break;
            case "Honda":
                holder.image.setImageResource(R.drawable.honda);
                break;
            case "Cadillac":
                holder.image.setImageResource(R.drawable.cadillac);
                break;
            case "Toyota":
                holder.image.setImageResource(R.drawable.toyota);
                break;
            case "Citroen":
                holder.image.setImageResource(R.drawable.citroen);
                break;
            case "Fiat":
                holder.image.setImageResource(R.drawable.fiat);
                break;
            case "Lancia":
                holder.image.setImageResource(R.drawable.lancia);
                break;
            case "Ford":
                holder.image.setImageResource(R.drawable.ford);
            break;
            case "Hyundai":
                holder.image.setImageResource(R.drawable.hyundai);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }


}

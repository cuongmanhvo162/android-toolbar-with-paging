package cuongvo.androidtoolbarwithpaging.util;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import cuongvo.androidtoolbarwithpaging.R;
import cuongvo.androidtoolbarwithpaging.data.CarBrandData;
import cuongvo.androidtoolbarwithpaging.data.CarData;

/**
 * Created by cuongvo on 5/14/17.
 */

public class DataUtil {

    public static List<CarData> getCarList(Context context) {
        String audi = context.getString(R.string.audi);
        String bmw = context.getString(R.string.bmw);
        String honda = context.getString(R.string.honda);
        String lexus = context.getString(R.string.lexus);
        String mercedes = context.getString(R.string.mercedes);
        String toyota = context.getString(R.string.toyota);
        String nissan = context.getString(R.string.nissan);

        List<CarData> list = new ArrayList<>();

        CarData audiA3 = new CarData();
        audiA3.setName(context.getString(R.string.audi_a3));
        audiA3.setBrand(audi);
        audiA3.setPicture(R.drawable.audi_a3_2017);
        list.add(audiA3);

        CarData audiA4 = new CarData();
        audiA4.setBrand(audi);
        audiA4.setName(context.getString(R.string.audi_a4));
        audiA4.setPicture(R.drawable.audi_a4_2017);
        list.add(audiA4);

        CarData audiA5 = new CarData();
        audiA5.setPicture(R.drawable.audi_a5_2017);
        audiA5.setBrand(audi);
        audiA5.setName(context.getString(R.string.audi_a5));
        list.add(audiA5);

        CarData bmw01 = new CarData();
        bmw01.setName(context.getString(R.string.bmw_01));
        bmw01.setBrand(bmw);
        bmw01.setPicture(R.drawable.bmw_01_2017);
        list.add(bmw01);

        CarData bmw02 = new CarData();
        bmw02.setName(context.getString(R.string.bmw_02));
        bmw02.setBrand(bmw);
        bmw02.setPicture(R.drawable.bmw_02_2017);
        list.add(bmw02);

        CarData bmwm3 = new CarData();
        bmwm3.setName(context.getString(R.string.bmw_m3));
        bmwm3.setBrand(bmw);
        bmwm3.setPicture(R.drawable.bmw_m3_2017);
        list.add(bmwm3);

        CarData hondaCivic = new CarData();
        hondaCivic.setName(context.getString(R.string.honda_civic));
        hondaCivic.setBrand(honda);
        hondaCivic.setPicture(R.drawable.honda_civic_2017);
        list.add(hondaCivic);

        CarData hondaHrv = new CarData();
        hondaHrv.setName(context.getString(R.string.honda_hrv));
        hondaHrv.setBrand(honda);
        hondaHrv.setPicture(R.drawable.honda_hrv_2017);
        list.add(hondaHrv);

        CarData hondaAccord = new CarData();
        hondaAccord.setName(context.getString(R.string.honda_accord));
        hondaAccord.setBrand(honda);
        hondaAccord.setPicture(R.drawable.honda_accord_2017);
        list.add(hondaAccord);

        CarData lexusIs = new CarData();
        lexusIs.setName(context.getString(R.string.lexus_is));
        lexusIs.setBrand(lexus);
        lexusIs.setPicture(R.drawable.lexus_is_2017);
        list.add(lexusIs);

        CarData lexusSuv = new CarData();
        lexusSuv.setName(context.getString(R.string.lexus_suv));
        lexusSuv.setBrand(lexus);
        lexusSuv.setPicture(R.drawable.lexus_suv_2017);
        list.add(lexusSuv);

        CarData lexusRc = new CarData();
        lexusRc.setName(context.getString(R.string.lexus_rc));
        lexusRc.setBrand(lexus);
        lexusRc.setPicture(R.drawable.lexus_rc_2017);
        list.add(lexusRc);

        CarData mercedesC300 = new CarData();
        mercedesC300.setName(context.getString(R.string.mercedes_c300));
        mercedesC300.setBrand(mercedes);
        mercedesC300.setPicture(R.drawable.mercedes_c300);
        list.add(mercedesC300);

        CarData mercedesE250 = new CarData();
        mercedesE250.setBrand(mercedes);
        mercedesE250.setName(context.getString(R.string.mercedes_e250));
        mercedesE250.setPicture(R.drawable.mercedes_e250_2017);
        list.add(mercedesE250);

        CarData mercedesS550 = new CarData();
        mercedesS550.setBrand(mercedes);
        mercedesS550.setName(context.getString(R.string.mercedes_s550));
        mercedesS550.setPicture(R.drawable.mercedes_s550_2017);
        list.add(mercedesS550);

        CarData toyotaCamry = new CarData();
        toyotaCamry.setBrand(toyota);
        toyotaCamry.setName(context.getString(R.string.toyota_camry));
        toyotaCamry.setPicture(R.drawable.toyota_camry_2017);
        list.add(toyotaCamry);

        CarData toyotaCorrella = new CarData();
        toyotaCorrella.setBrand(toyota);
        toyotaCorrella.setName(context.getString(R.string.toyota_corrella));
        toyotaCorrella.setPicture(R.drawable.toyota_corrella_2017);
        list.add(toyotaCorrella);

        CarData toyotaPrius = new CarData();
        toyotaPrius.setName(context.getString(R.string.toyota_prius));
        toyotaPrius.setBrand(toyota);
        toyotaPrius.setPicture(R.drawable.toyota_prius_2017);
        list.add(toyotaPrius);

        CarData nissanAltima = new CarData();
        nissanAltima.setName(context.getString(R.string.nissan_altima));
        nissanAltima.setBrand(nissan);
        nissanAltima.setPicture(R.drawable.nissan_altima_2017);
        list.add(nissanAltima);

        CarData nissanSentra = new CarData();
        nissanSentra.setBrand(nissan);
        nissanSentra.setName(context.getString(R.string.nissan_sentra));
        nissanSentra.setPicture(R.drawable.nissan_sentra_2017);
        list.add(nissanSentra);

        CarData nissanVersa = new CarData();
        nissanVersa.setName(context.getString(R.string.nissan_versa));
        nissanVersa.setBrand(nissan);
        nissanVersa.setPicture(R.drawable.nissan_versa_2017);
        list.add(nissanVersa);

        return list;
    }

    public static List<CarBrandData> getCarBrandList(Context context) {
        List<CarBrandData> list = new ArrayList<>();

        CarBrandData toyota = new CarBrandData();
        toyota.setName(context.getString(R.string.toyota));
        list.add(toyota);

        CarBrandData nissan = new CarBrandData();
        nissan.setName(context.getString(R.string.nissan));
        list.add(nissan);

        CarBrandData mercedes = new CarBrandData();
        mercedes.setName(context.getString(R.string.mercedes));
        list.add(mercedes);

        CarBrandData honda = new CarBrandData();
        honda.setName(context.getString(R.string.honda));
        list.add(honda);

        CarBrandData audi = new CarBrandData();
        audi.setName(context.getString(R.string.audi));
        list.add(audi);

        CarBrandData lexus = new CarBrandData();
        lexus.setName(context.getString(R.string.lexus));
        list.add(lexus);

        CarBrandData bmw = new CarBrandData();
        bmw.setName(context.getString(R.string.bmw));
        list.add(bmw);

        return list;
    }
}

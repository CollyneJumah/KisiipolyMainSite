package com.example.kisii_national_polytechnic;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class classAcademicDepartments extends Fragment {
    private ImageView adminImage, imgMechanicalEng,imgHealthS,imgBussnessS,imgComputer,imgCommunityDS,imgAppliedS,imgBuildingCS,imgInstitutionM,imgEee;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_academicdepartmeent, container, false);
    }

   @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

                // get the button view
                adminImage = (ImageView) getView().findViewById(R.id.admin_image);
                // set a onclick listener for when the button gets clicked
                adminImage.setOnClickListener(new View.OnClickListener(){
                    // Start new list activity
                    public void onClick(View v) {
                        Intent mainIntent = new Intent(getActivity(),
                                Administration.class);
                        startActivity(mainIntent);
                    }
                });
//===============mechanical Department is called==================================
                imgMechanicalEng=getView().findViewById(R.id.image_mechanichalE);
                imgMechanicalEng.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent mainIntent = new Intent(getActivity(),
                                mechanicalEngn.class);
                        startActivity(mainIntent);
                    }
                });
//==========================institution Management================================
       imgInstitutionM=getView().findViewById(R.id.image_institutionM);
       imgInstitutionM.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       InstitutionManagement.class);
               startActivity(mainIntent);
           }
       });

//========================Electrical EE===========================================
  imgEee=getView().findViewById(R.id.image_Eee);
  imgEee.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent mainIntent = new Intent(getActivity(),
                  ElectricalAndEe.class);
          startActivity(mainIntent);
      }
  });
//       ===================Business studies======================================
       imgBussnessS=getView().findViewById(R.id.image_businessS);
       imgBussnessS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       BusinessStudies.class);
               startActivity(mainIntent);
           }
       });

// ====================Computer Studies===========================================
       imgComputer=getView().findViewById(R.id.image_computerS);
       imgComputer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       ComputerStudies.class);
               startActivity(mainIntent);
           }
       });

// ====================CommunicationDS==============================================
       imgCommunityDS=getView().findViewById(R.id.image_communityDs);
       imgCommunityDS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       CommunityDevStudies.class);
               startActivity(mainIntent);
           }
       });


// =====================Health Sciences============================================
       imgHealthS=getView().findViewById(R.id.image_healthS);
       imgHealthS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       HealthScience.class);
               startActivity(mainIntent);
           }
       });

// =====================Applied Sciences============================================
       imgAppliedS=getView().findViewById(R.id.image_appliedS);
       imgAppliedS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       AppliedSciences.class);
               startActivity(mainIntent);
           }
       });

// ======================Building & Civil Engineering==============================
       imgBuildingCS=getView().findViewById(R.id.image_buidingCe);
       imgBuildingCS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       BuildingCiviEngineer.class);
               startActivity(mainIntent);
           }
       });

    }

}



package com.covid19.telangana;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class hospitals extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng latLng;
    private FusedLocationProviderClient fusedLocationClient;
    LocationRequest mLocationRequest;
    Location mLastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(180000);
        mLocationRequest.setFastestInterval(90000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        fusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
        mMap.setMyLocationEnabled(true);

        // Test Center 1
        final LatLng center1 = new LatLng(17.725085, 78.407541);
        mMap.addMarker(new MarkerOptions().position(center1).title("Biognosys Technologies (India) Private Limited").snippet("website: https://www.biognosys.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center1));

        //Test Center 2
        final LatLng center2 = new LatLng(17.725085, 78.407541);
        mMap.addMarker(new MarkerOptions().position(center2).title("ESIC Hospital").snippet("website: https://www.esic.nic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center2));

        //Test Center 3
        final LatLng center3 = new LatLng(17.620406, 78.455847);
        mMap.addMarker(new MarkerOptions().position(center3).title("Tenet Diagnostics").snippet("website: https://www.tenetdiagnostics.in/contactus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center3));

        //Test Center 4
        final LatLng center4 = new LatLng(17.620406, 78.456390);
        mMap.addMarker(new MarkerOptions().position(center4).title("Dept of Lab Medicine, Star Hospitals").snippet("website: http://www.starhospitals.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center4));

        //Test Center 5
        final LatLng center5 = new LatLng(17.588991, 78.473896);
        mMap.addMarker(new MarkerOptions().position(center5).title("Nizam's Institute Of Medical Sciences").snippet("website: https://nims.edu.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center5));

        //Test Center 6
        final LatLng center6 = new LatLng(17.599463, 78.429951);
        mMap.addMarker(new MarkerOptions().position(center6).title("Dr.Remedies Labs").snippet("website: http://www.remedieslabs.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));

        //Test Center 7
        final LatLng center7 = new LatLng(17.609935, 78.436826);
        mMap.addMarker(new MarkerOptions().position(center7).title("Cell Correct Diagnostics"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center7));

        //Test Center 8
        final LatLng center8 = new LatLng(17.609935, 78.436826);
        mMap.addMarker(new MarkerOptions().position(center8).title("Sir Ronald Ross Institute Of Parasitology").snippet("website: http://www.welltechfoundation.org/ronald-ross.php"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center8));

        //Test Center 9
        final LatLng center9 = new LatLng(17.725085, 78.457515);
        mMap.addMarker(new MarkerOptions().position(center9).title("Medcis Pathlabs").snippet("website: http://medcislabs.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center9));

        //Test Center 10
        final LatLng center10 = new LatLng(17.672753, 78.479488);
        mMap.addMarker(new MarkerOptions().position(center10).title("Apollo Diagnostics").snippet("website: https://www.apollodiagnostics.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));

        //Test Center 11
        final LatLng center11 = new LatLng(17.588991, 78.475265);
        mMap.addMarker(new MarkerOptions().position(center11).title("Department of Laboratory Medicine, Gleneagles Global Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center11));

        //Test Center 12
        final LatLng center12 = new LatLng(17.620406, 78.468502);
        mMap.addMarker(new MarkerOptions().position(center12).title("Krishna Institute of Medical Sciences Nursing College and School").snippet("website: http://kimscon.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center12));

        //Test Center 13
        final LatLng center13 = new LatLng(17.578518, 78.472517);
        mMap.addMarker(new MarkerOptions().position(center13).title("Vijaya Diagnostic Centre, Himayatnagar").snippet("website: https://www.vijayadiagnostic.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center13));

        //Test Center 14
        final LatLng center14 = new LatLng(17.620406, 78.473834);
        mMap.addMarker(new MarkerOptions().position(center14).title("Lucid Diagnostics and Imaging Centre").snippet("website: https://www.luciddiagnostics.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center14));

        //Test Center 15
        final LatLng center15 = new LatLng(17.609935, 78.448030);
        mMap.addMarker(new MarkerOptions().position(center15).title("Department of Lab Medicine").snippet("website: https://www.yashodahospitals.com/location/secunderabad/?utm_source=Google-Business-Page&utm_medium=secunderabad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center15));

        //Test Center 16
        final LatLng center16 = new LatLng(17.568044, 78.496546);
        mMap.addMarker(new MarkerOptions().position(center16).title("Osmania Medical College").snippet("website: https://osmaniamedicalcollege.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center16));

        //Test Center 17
        final LatLng center17 = new LatLng(17.599463, 78.477695);
        mMap.addMarker(new MarkerOptions().position(center17).title("Institute of Preventive Medicine").snippet("website: http://ipm.ap.nic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center17));

        //Test Center 18
        final LatLng center18 = new LatLng(17.620406, 78.528337);
        mMap.addMarker(new MarkerOptions().position(center18).title("Gandhi Hospital").snippet("website: http://www.gandhihospital.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center18));

        //Test Center 19
        final LatLng center19 = new LatLng(17.609935, 78.528604);
        mMap.addMarker(new MarkerOptions().position(center19).title("Gandhi Medical College").snippet("website: http://www.gandhihospital.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center19));

        //Test Center 20
        final LatLng center20 = new LatLng(17.609935, 78.502981);
        mMap.addMarker(new MarkerOptions().position(center20).title("CSIR - Centre for Cellular and Molecular Biology").snippet("website: https://www.ccmb.res.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center20));

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker.getPosition().equals(center1)) {
                    Uri uriUrl = Uri.parse("https://www.biognosys.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center2)) {
                    Uri uriUrl = Uri.parse("https://www.esic.nic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }

                else if(marker.getPosition().equals(center3)) {
                    Uri uriUrl = Uri.parse("https://www.tenetdiagnostics.in/contactus");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center4)) {
                    Uri uriUrl = Uri.parse("http://www.starhospitals.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center5)) {
                    Uri uriUrl = Uri.parse("https://nims.edu.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center6)) {
                    Uri uriUrl = Uri.parse("http://www.remedieslabs.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center8)) {
                    Uri uriUrl = Uri.parse("http://www.welltechfoundation.org/ronald-ross.php");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center9)) {
                    Uri uriUrl = Uri.parse("http://medcislabs.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center10)) {
                    Uri uriUrl = Uri.parse("https://www.apollodiagnostics.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center12)) {
                    Uri uriUrl = Uri.parse("http://kimscon.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center13)) {
                    Uri uriUrl = Uri.parse("https://www.vijayadiagnostic.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center14)) {
                    Uri uriUrl = Uri.parse("https://www.luciddiagnostics.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center15)) {
                    Uri uriUrl = Uri.parse("https://www.yashodahospitals.com/location/secunderabad/?utm_source=Google-Business-Page&utm_medium=secunderabad");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center16)) {
                    Uri uriUrl = Uri.parse("https://osmaniamedicalcollege.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center17)) {
                    Uri uriUrl = Uri.parse("http://ipm.ap.nic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center18)) {
                    Uri uriUrl = Uri.parse("http://www.gandhihospital.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center19)) {
                    Uri uriUrl = Uri.parse("http://www.gandhihospital.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center20)) {
                    Uri uriUrl = Uri.parse("https://www.ccmb.res.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
            }
        });

    }

    LocationCallback mLocationCallback=new LocationCallback(){
        @Override
        public void onLocationResult(LocationResult locationResult) {
            for(Location location1 : locationResult.getLocations()) {
                if (getApplicationContext() != null) {
                    mLastLocation = location1;
                    latLng = new LatLng(location1.getLatitude(), location1.getLongitude());
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
                }
            }

        }
    };
    public void onBackPressed(){
        Intent intent = new Intent(hospitals.this, home.class);
        startActivity(intent);
        finish();
    }
}
